package com.project.Project.model;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
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
    @Enumerated(EnumType.STRING)
    @Column(name = "paymentMethod")
    private PaymentMethod paymentMethod;

    @NotNull
    @Size(max = 10)
    @Column(name = "phoneNumber")
    private int phoneNumber;


}