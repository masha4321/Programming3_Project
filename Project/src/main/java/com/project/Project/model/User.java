package com.project.Project.model;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "user")
@Getter
@Setter
@NoArgsConstructor // hibernate requires no-arg constructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @Column(name = "userId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @NotNull
    @Size(max = 65)
    @Column(name = "firstName")
    private String firstName;

    @NotNull
    @Size(max = 65)
    @Column(name = "lastName")
    private String lastName;

    @NotNull
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "addressId", referencedColumnName = "addressId")
    private Address address;

    @NotNull
    @Size(max = 10)
    @Column(name = "phoneNumber")
    private int phoneNumber;


    private String password;

    @OneToOne
    private OrderDelivery orderDelivery;

    //Could this be a One to One relationship instead?
    @OneToMany
    private List<OrderDelivery> orderDeliveryList;


}