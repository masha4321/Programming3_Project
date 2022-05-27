package com.project.Project.model;


import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "address")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "addressId")
    private Long addressId;

    @NotNull
    @Size(max = 40)
    @Column(name = "street")
    private String street;

    @Size(max = 10)
    @Column(name = "appartement_number")
    private int number;

    @NotNull
    @Size(max = 30)
    @Column(name = "city")
    private String city;

    @NotNull
    @Size(max = 30)
    @Column(name = "province_or_state")
    private String province_or_state;

    @NotNull
    @Size(max = 30)
    @Column(name = "country")
    private String country;

    @NotNull
    @Size(max = 10)
    @Column(name = "postal_or_zip_code")
    private String postal_or_zip_code;
}