package com.project.Project.model;


import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "address")
@Getter
@Setter
@NoArgsConstructor // hibernate requires no-arg constructor
@AllArgsConstructor
@Builder
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Size(max = 10)
    @Column(name = "number")
    private int number;

    @NotNull
    @Size(max = 30)
    @Column(name = "street")
    private String street;

    @NotNull
    @Size(max = 30)
    @Column(name = "city")
    private String city;

    @NotNull
    @Size(max = 30)
    @Column(name = "province")
    private String province;

    @NotNull
    @Size(max = 30)
    @Column(name = "country")
    private String country;
}