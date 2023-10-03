package com.example.Example1.controller;

import com.example.Example1.entity.Address;
import com.example.Example1.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @PostMapping
    public Address addAddrs(@RequestBody Address address){
      return addressService.addAddrs(address);
    }
    @GetMapping
    public List<Address> getAddrs(){
        return addressService.getAddrs();

    }



}
