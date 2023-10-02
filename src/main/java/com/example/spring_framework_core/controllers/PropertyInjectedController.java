package com.example.spring_framework_core.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.spring_framework_core.services.GreetingService;

@Controller
public class PropertyInjectedController {

    // Field injection is not recommended
    @Autowired
    private GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayHello();
    }

}
