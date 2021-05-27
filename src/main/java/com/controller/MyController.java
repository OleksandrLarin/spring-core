package com.controller;

import com.model.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private UserService userService;

    @GetMapping("hello")
    public String getGreeting(@RequestParam(defaultValue = "World") String name) {
        return String.format("Hello %s!!!", name);
    }

    @GetMapping("users")
    public List<User> getUser() {
        return userService.getAll();
    }

    @PostMapping("users")
    public User createUser(@RequestBody User user) {
        userService.add(user);
        return user;
    }

    @DeleteMapping("users")
    public String createUser(@RequestParam String name) {
//        userService.add(user);
        return "Ok";
    }

}
