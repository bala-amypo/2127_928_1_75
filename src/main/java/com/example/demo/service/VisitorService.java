package com.example.demo.service;

import com.example.demo.model.VisitorModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VisitorService {

    private final List<VisitorModel> visitors = new ArrayList<>();

    public VisitorModel create(VisitorModel visitor) {
        visitors.add(visitor);
        return visitor;
    }

    public List<VisitorModel> getAll() {
        return visitors;
    }
}
