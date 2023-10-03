package com.example.Example1.entity;

import com.example.Example1.entity.Address;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Set;

@Data
@Entity
@Table(name = "person_db")
@AllArgsConstructor
@NoArgsConstructor

public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotBlank(message = "name should not be blank")
    private String name;
    private int age ;
    private String email;


//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "fk_address_id")

//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "fk_person_id",referencedColumnName = "id")
//    private List<Address> address;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Address> addressset;
}
