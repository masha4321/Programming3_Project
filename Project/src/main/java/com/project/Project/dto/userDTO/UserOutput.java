package com.project.Project.dto.userDTO;

import com.project.Project.model.Address;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserOutput {

    private Long userId;
    private String firstName;
    private String lastName;
    private Address address;
    private int phoneNumber;
}
