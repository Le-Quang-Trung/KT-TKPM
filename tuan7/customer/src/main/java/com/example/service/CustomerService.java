package com.example.service;

import com.example.entity.Customer;

import java.util.List;

public interface CustomerService {

    Customer addCustomer(Customer customer);

    List<Customer> getCustomer();

    void updateCustomer(String id, Customer customer);

    void deleteCustomer(String id);
}
