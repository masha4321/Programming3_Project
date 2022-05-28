package com.project.Project.dto.addressDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AddressOutput {

    private Long addressId;

    private String street;

    private int appartementNumber;

    private String city;

    private String provinceOrState;

    private String country;

    private String postalOrZipCode;
}
