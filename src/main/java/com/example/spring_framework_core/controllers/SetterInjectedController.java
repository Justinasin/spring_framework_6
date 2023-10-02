package com.example.spring_framework_core.controllers;

import com.example.spring_framework_core.services.GreetingService;

public class SetterInjectedController {

    private GreetingService greetingService;


    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayHello();
    }
}
