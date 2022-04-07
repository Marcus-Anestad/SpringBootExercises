package com.example.exercise101_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class Exercise1011Application {

    public static void main(String[] args) {
        SpringApplication.run(Exercise1011Application.class, args);
    }

    @GetMapping("/")
    public String getHome(){
        return "index";
    }

}
