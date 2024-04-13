package com.develop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController


public class Develope {
    @GetMapping
    public String message() {
        return "welcome to myapplication";
    }

    public static void main(String[] args) {
        SpringApplication.run(Develope.class, args);    
    }
}
