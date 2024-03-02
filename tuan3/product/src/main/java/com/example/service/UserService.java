package com.example.service;

import com.example.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    public List<Product> getAllUser();
}
