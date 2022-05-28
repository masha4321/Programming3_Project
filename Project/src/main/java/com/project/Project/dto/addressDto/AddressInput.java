package com.project.Project.dto.addressDto;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AddressInput {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
