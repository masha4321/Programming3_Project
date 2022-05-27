package com.project.Project.model;


import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "restaurantInfo")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RestaurantInfo {

    @Id
    @Column(name = "restaurantId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long restaurantId;

    @NotNull
    @Size(max = 65)
    @Column(name = "restaurantName")
    private String restaurantName;

    @ManyToOne
    @JoinColumn(name = "addressId", referencedColumnName = "addressId")
    private Address address;

    @NotNull
    @Size(max = 10)
    @Column(name = "phoneNumber")
    private int phoneNumber;

}