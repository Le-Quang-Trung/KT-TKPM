package com.example.demo.Controller;

import com.example.demo.Entity.User;
import com.example.demo.service.Service;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/list-user")
@RequiredArgsConstructor
public class Controller {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private Service userService;


//    @GetMapping("user")
//    public Object getForObject(){
//        String url = "http://localhost:8081/user";
//        return restTemplate.getForObject(url, Object.class);
//   }

    @GetMapping("user")
    public ResponseEntity<List<User>> getAll(){
        List<User> list = userService.getAllEmployees();
        return new ResponseEntity<List<User>>(list, HttpStatus.OK);
    }
    @GetMapping("employee/{id}")
    public ResponseEntity<User> getEmployeeById(@PathVariable("id") Integer id) {
        User emp = userService.getUserById(id);
        return new ResponseEntity<User>(emp, HttpStatus.OK);
    }
}
