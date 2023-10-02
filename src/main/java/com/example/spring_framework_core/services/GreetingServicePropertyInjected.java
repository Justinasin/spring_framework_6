package com.example.spring_framework_core.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServicePropertyInjected implements GreetingService {

    @Override
    public String sayHello() {
        return "Friends don't let friends to property injection";
    }
}
