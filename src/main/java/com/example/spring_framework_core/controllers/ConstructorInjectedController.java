package com.example.spring_framework_core.controllers;

import org.springframework.stereotype.Controller;

import com.example.spring_framework_core.services.GreetingService;

@Controller
public class ConstructorInjectedController {

    private final GreetingService greetingService;


    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayHello();
    }
}
