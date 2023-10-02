package com.example.spring_framework_core.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.spring_framework_core.services.GreetingServiceImpl;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController constructorInjectedController;

    @BeforeEach
    void setUp() {
        constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());

    }

    @Test
    void sayHello() {
        System.out.println(constructorInjectedController.sayHello());
    }
}
