package com.project.Project.dto.addressDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AddressInput {

    private Long addressId;

    private String street;

    private int appartementNumber;

    private String city;

    private String provinceOrState;

    private String country;

    private String postalOrZipCode;
}
