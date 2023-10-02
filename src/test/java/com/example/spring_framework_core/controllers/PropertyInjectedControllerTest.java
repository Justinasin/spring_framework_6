package com.example.spring_framework_core.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.spring_framework_core.services.GreetingServiceImpl;

class PropertyInjectedControllerTest {

    PropertyInjectedController propertyInjectedController;

    @BeforeEach
    void setUp() {

        propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.greetingService = new GreetingServiceImpl();

    }

    @Test
    void sayHello() {
        System.out.println(propertyInjectedController.sayHello());
    }
}
