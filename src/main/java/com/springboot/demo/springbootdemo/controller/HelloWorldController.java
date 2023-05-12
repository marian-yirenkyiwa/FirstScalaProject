package com.springboot.demo.springbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
    @GetMapping("/welcome")
    public String getWelcomeMessage(){
        return "Welcome to Java Spring boot with IntelliJ Idea - Marian";
    }
}


//Rest API include
// -> GET
// -> POST
// -> PUT
// -> DELETE