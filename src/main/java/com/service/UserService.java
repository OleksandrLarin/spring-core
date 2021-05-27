package com.service;

import com.model.User;

import java.util.List;

public interface UserService {
    User getUser(String name);

    List<User> getAll();

    void add(User user);
}
