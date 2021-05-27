package com.service;

import com.mock.UserStorage;
import com.model.User;

import java.util.List;

public class UserServiceImpl implements UserService{

    private UserStorage storage;

    public UserServiceImpl(UserStorage storage) {
        this.storage = storage;
    }

    @Override
    public User getUser(String name) {
        return storage.findUser(name);
    }

    @Override
    public List<User> getAll() {
        return storage.getAllUsers();
    }

    @Override
    public void add(User user) {
        storage.createUser(user);
    }
}
