package com.example.demo.service;

import com.example.demo.Entity.User;

import java.util.Arrays;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    public User getUserById(int id){
        System.out.println("empId: " + id);
        return new User(101, "Lakshman" );
    }

    public List<User> getAllEmployees() {
        // Perform database operation
        User e1 = new User(101, "Lakshman");
        User e2 = new User(102, "Bharat");
        User e3 = new User(103, "Shatrughan");
        return Arrays.asList(e1, e2, e3);
    }
}
