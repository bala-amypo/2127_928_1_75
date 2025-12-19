package com.example.demo.service;

import com.example.demo.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class VisitorService {

    private final Map<Long, String> visitors = new HashMap<>();
    private long counter = 1;

    public Long addVisitor(String name) {
        long id = counter++;
        visitors.put(id, name);
        return id;
    }

    public String getVisitor(Long id) {
        if (!visitors.containsKey(id)) throw new ResourceNotFoundException("Visitor not found: " + id);
        return visitors.get(id);
    }

    public void updateVisitor(Long id, String name) {
        if (!visitors.containsKey(id)) throw new ResourceNotFoundException("Visitor not found: " + id);
        visitors.put(id, name);
    }

    public void deleteVisitor(Long id) {
        if (!visitors.containsKey(id)) throw new ResourceNotFoundException("Visitor not found: " + id);
        visitors.remove(id);
    }
}
