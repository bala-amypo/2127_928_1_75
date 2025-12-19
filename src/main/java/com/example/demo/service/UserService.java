package com.example.demo.service;

import com.example.demo.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    private final Map<Long, String> users = new HashMap<>();
    private long counter = 1;

    public Long addUser(String username) {
        long id = counter++;
        users.put(id, username);
        return id;
    }

    public String getUser(Long id) {
        if (!users.containsKey(id)) throw new ResourceNotFoundException("User not found: " + id);
        return users.get(id);
    }

    public void updateUser(Long id, String username) {
        if (!users.containsKey(id)) throw new ResourceNotFoundException("User not found: " + id);
        users.put(id, username);
    }

    public void deleteUser(Long id) {
        if (!users.containsKey(id)) throw new ResourceNotFoundException("User not found: " + id);
        users.remove(id);
    }
}
