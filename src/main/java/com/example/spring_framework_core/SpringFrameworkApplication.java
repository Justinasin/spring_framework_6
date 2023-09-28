package com.example.spring_framework_core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.spring_framework_core.controllers.MyController;

@SpringBootApplication
public class SpringFrameworkApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringFrameworkApplication.class, args);
        MyController myController = ctx.getBean(MyController.class);

        myController.sayHello();
    }

}
