package com.project.Project.model;

import com.project.Project.model.constants.FoodSize;
import com.project.Project.model.constants.ItemType;
import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Entity
@Table(name = "item")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Item {

    @Id
    @Column(name = "itemId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long itemId;

    @NotNull
    @Size(max = 50)
    @Column(name = "itemName")
    private String itemName;

    @NotNull
    @Min(0)
    @Max(1000000)
    @Column(name = "itemPrice")
    private double itemPrice;

    @NotNull
    @Size(max = 200)
    @Column(name = "itemDescription")
    private String itemDescription;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "itemType")
    private ItemType itemType;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "itemSize")
    private FoodSize itemSize;

    @OneToMany
    @JoinColumn(name="orderItem")
    private OrderDetails orderDetails;
}