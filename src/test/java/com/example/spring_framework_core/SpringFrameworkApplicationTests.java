package com.example.spring_framework_core;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.example.spring_framework_core.controllers.MyController;

@SpringBootTest
class SpringFrameworkApplicationTests {

    @Autowired
    private MyController myController;

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testAutowiredOfController() {
        myController.sayHello();
    }

    @Test
    void testGetControllerFromCtx() {
        MyController myController = applicationContext.getBean(MyController.class);

        myController.sayHello();
    }

}
