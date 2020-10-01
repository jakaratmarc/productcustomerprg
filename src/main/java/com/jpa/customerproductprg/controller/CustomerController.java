package com.jpa.customerproductprg.controller;

import com.jpa.customerproductprg.model.Customer;
import com.jpa.customerproductprg.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    //insert customer
    @PostMapping(value="/savecust")
    public String saveCust(@RequestBody Customer customer) {
        customerRepository.save(customer);
        return "Customer saved";
    }
}
