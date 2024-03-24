package com.example.controller;

import com.example.entity.Customer;
import com.example.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @PostMapping("/add")
    public Customer createCustomer(@RequestBody Customer customer){
        customerService.addCustomer(customer);
        return customer;
    }

    @GetMapping
    public List<Customer> getCustomer() { return customerService.getCustomer();}

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateCustomer(@PathVariable String id, @RequestBody Customer customer){
        customerService.updateCustomer(id, customer);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCusomer(@PathVariable String id){
        customerService.deleteCustomer(id);
        return ResponseEntity.noContent().build();
    }
}


