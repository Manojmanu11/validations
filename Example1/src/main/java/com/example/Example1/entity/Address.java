package com.example.Example1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "address_db")
@Entity

public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    public String city;
    public String street;
//    @OneToOne(mappedBy = "address")
//      private Person person;



}
