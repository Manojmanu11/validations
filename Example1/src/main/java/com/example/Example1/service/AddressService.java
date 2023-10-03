package com.example.Example1.service;

import com.example.Example1.entity.Address;
import com.example.Example1.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class AddressService {
    @Autowired
    private AddressRepository addressRepository;

    public Address addAddrs(Address address){
        return addressRepository.save(address);
    }
    public List<Address> getAddrs(){
        return addressRepository.findAll();
    }
}
