package com.example.Example1.service;

import com.example.Example1.entity.Person;
import com.example.Example1.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;

    public Person addUser(Person person){
        return personRepository.save(person);
    }
    public List<Person> getAllUser(){
        return  personRepository.findAll();
    }
//    public Person deletePerson(){
//        return personRepository.delete(person);
//    }
}
