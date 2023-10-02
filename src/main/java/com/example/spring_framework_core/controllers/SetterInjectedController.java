package com.example.spring_framework_core.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.example.spring_framework_core.services.GreetingService;

@Controller
public class SetterInjectedController {

    // Setter injection is not recommended
    private GreetingService greetingService;

    @Autowired
    public void setGreetingService(@Qualifier("greetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayHello();
    }
}
