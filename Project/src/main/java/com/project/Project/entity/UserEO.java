package com.project.Project.entity;

import com.project.Project.model.Address;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name="user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEO {
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
}
