package com.example.spring_framework_core.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayHello() {
        return "Hello everyone From Base Service!!!";
    }
}
