package com.study;

import com.study.context.ClassPathXmlApplicationContext;
import com.study.context.support.ApplicationContext;
import com.study.service.UserService;

public class TestApplication {
    public static void main(String[] args) throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-application.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.add();
        System.out.println(userService);
    }
}
