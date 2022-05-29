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
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "addressId")
    private Long addressId;

    @NotNull
    @Size(max = 40)
    @Column(name = "street")
    private String street;

    @Size(max = 10)
    @Column(name = "appartementNumber")
    private int appartementNumber;

    @NotNull
    @Size(max = 30)
    @Column(name = "city")
    private String city;

    @NotNull
    @Size(max = 30)
    @Column(name = "provinceOrState")
    private String provinceOrState;

    @NotNull
    @Size(max = 30)
    @Column(name = "country")
    private String country;

    @NotNull
    @Size(max = 10)
    @Column(name = "postalOrZipCode")
    private String postalOrZipCode;
}