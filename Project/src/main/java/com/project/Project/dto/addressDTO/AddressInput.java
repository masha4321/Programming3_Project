package com.project.Project.dto.addressDTO;

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
