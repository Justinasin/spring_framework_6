package com.example.spring_framework_core.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServicePrimary implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello from Primary Bean";
    }
}
