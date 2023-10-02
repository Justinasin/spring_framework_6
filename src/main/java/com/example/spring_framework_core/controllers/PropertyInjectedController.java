package com.example.spring_framework_core.controllers;

import com.example.spring_framework_core.services.GreetingService;

public class PropertyInjectedController {

    GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayHello();
    }

}
