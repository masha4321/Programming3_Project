package com.project.Project.model;

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
    @Column(name = "item_name")
    private String item_name;

    @NotNull
    @Min(0)
    @Max(1000000)
    @Column(name = "item_price")
    private BigDecimal item_price;

    @NotNull
    @Size(max = 200)
    @Column(name = "item_description")
    private String description;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "item_type")
    private Type item_type;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "item_size")
    private FoodSize item_size;
}