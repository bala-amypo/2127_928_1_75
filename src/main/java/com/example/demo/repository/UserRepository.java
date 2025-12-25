package com.example.demo.repository;

import com.example.demo.model.UserModel;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserRepository {

    private final Map<String, UserModel> store = new HashMap<>();

    public UserModel save(UserModel user) {
        store.put(user.getUsername(), user);
        return user;
    }

    public UserModel findByUsername(String username) {
        return store.get(username);
    }
}
