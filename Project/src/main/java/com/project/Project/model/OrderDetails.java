package com.project.Project.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "orderDetails")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderDetails {

    @Id
    @Column(name = "orderDetailsId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderDetailsId;
    private int itemQuantity;
    private BigDecimal subtotal;

    @ManyToOne
    @JoinColumn(name = "orderId", referencedColumnName = "orderId")
    private OrderDelivery orderDelivery;

    @OneToOne
    @JoinColumn(name = "itemId", referencedColumnName = "itemId")
    private Item item;

    @ManyToOne
    @JoinColumn(name = "itemId", referencedColumnName = "itemId")
    private List<Item> itemList;

}