package com.service;

import com.mock.UserStorage;
import com.model.User;

import java.util.List;

public class UserServiceImplI18n implements UserService{

    private UserStorage storage;

    public UserServiceImplI18n(UserStorage storage) {
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

    public void init() {
        System.out.print("Is Storage null? - " + storage == null);
    }
}
