package com.project.Project.model;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {

    @Id
    @Column(name = "order_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long order_id;

    @NotNull
    @Column(name = "order_total")
    private int order_total;

    @Temporal(TemporalType.DATE)
    @Column(name="order_date")
    private Date order_date;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "order_status")
    private Status order_status;
}