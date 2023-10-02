package com.example.spring_framework_core.controllers;

import org.springframework.stereotype.Controller;

import com.example.spring_framework_core.services.GreetingService;
import com.example.spring_framework_core.services.GreetingServiceImpl;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello() {
        System.out.println("I'm in the controller");

        return greetingService.sayHello();
    }

}
