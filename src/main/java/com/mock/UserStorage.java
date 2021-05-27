package com.mock;

import com.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserStorage {


    public UserStorage() {
        System.out.println("UserStorage created");
    }

    private Map<String, User> storage;

    public User findUser(String name) {
        if (storage != null) {
            return storage.get(name);
        }
        return null;
    }

    public void setStorage(Map<String, User> storage) {
        this.storage = storage;
    }

    public List<User> getAllUsers() {
        return new ArrayList<>(storage.values());
    }

    public void createUser(User user) {
        storage.put(user.getName(), user);
    }

    public void initStorage() {
        for (Map.Entry<String, User> entry :storage.entrySet()){
            if (entry.getKey().contains("Test")) {
                entry.getValue().setEmail("test@test.com");
            }
        }
    }
}
