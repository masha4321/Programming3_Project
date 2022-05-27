package com.project.Project.model;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "order")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {

    @Id
    @Column(name = "orderId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    @NotNull
    @Column(name = "orderTotal")
    private int orderTotal;

    @Temporal(TemporalType.DATE)
    @Column(name="orderDate")
    private Date orderDate;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "orderStatus")
    private Status orderStatus;
}