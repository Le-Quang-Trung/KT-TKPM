package com.example.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class BrandController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/user")
    public Object getForObjectUser(){
        String url = "http://localhost:8081/user";
        return restTemplate.getForObject(url, Object.class);
    }

    @GetMapping("/product")
    public Object getForObjectUser(){
        String url = "http://localhost:8082/product";
        return restTemplate.getForObject(url, Object.class);
    }
}
