package com.project.Project.model;


import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "restaurant")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @Size(max = 65)
    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    @NotNull
    @Size(max = 10)
    @Column(name = "phone_number")
    private int phoneNumber;

    @OneToMany  //I am sure we are missing more to this annotation, I dont think the Menu is correctly done
    @JoinColumn(name = "menu_id", referencedColumnName = "id")
    private Menu menu;
}