package com.example.demo.repository;

import com.example.demo.model.UserModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {

    private final List<UserModel> users = new ArrayList<>();

    public UserModel save(UserModel user) {
        users.add(user);
        return user;
    }

    public Optional<UserModel> findByUsername(String username) {
        return users.stream()
                .filter(u -> u.getUsername().equals(username))
                .findFirst();
    }

    public List<UserModel> findAll() {
        return users;
    }
}
