package com.project.Project.model;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orders")
@Getter
@Setter
@NoArgsConstructor // hibernate requires no-arg constructor
@AllArgsConstructor
@Builder
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "price")
    private int price;

    @NotNull
    @Column(name = "quantity")
    private int quantity;

    @Temporal(TemporalType.DATE)
    @Column(name="date")
    private Date date;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status;
}