package com.example.my_hello_world;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @GetMapping("/hello-world")
    public String helloWorld() {
        return "hello-world";
    }
}
