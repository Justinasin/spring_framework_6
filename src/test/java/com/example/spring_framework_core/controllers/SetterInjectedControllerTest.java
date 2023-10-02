package com.example.spring_framework_core.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.spring_framework_core.services.GreetingServiceImpl;

class SetterInjectedControllerTest {

    SetterInjectedController setterInjectedController;

    @BeforeEach
    void setUp() {
        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingService(new GreetingServiceImpl());

    }


    @Test
    void sayHello() {

        System.out.println(setterInjectedController.sayHello());
    }
}
