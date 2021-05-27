package com;

import com.model.User;
import com.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/resources/app.xml");

        UserService userService = context.getBean("userService",UserService.class);

        userService.add(new User("Bill", "bill@eamil.com", 34));

        System.out.println(userService.getAll());

        context.close();
    }
}
