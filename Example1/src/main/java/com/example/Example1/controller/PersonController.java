package com.example.Example1.controller;

import com.example.Example1.entity.Person;
import com.example.Example1.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/person")
@CacheConfig(cacheNames = "persons")
public class PersonController {
    @Autowired
    private PersonService personService;
    @PostMapping("/add")
    public Person addUser(@Valid @RequestBody Person user){
        return personService.addUser(user);

    }
    @GetMapping("/getAllPerson")
    public List<Person> getAllUser(){
        return personService.getAllUser();
    }

//    @DeleteMapping("/delete/{id}")


}
