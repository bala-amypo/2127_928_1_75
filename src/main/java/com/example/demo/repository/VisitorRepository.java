package com.example.demo.repository;

import com.example.demo.model.VisitorModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class VisitorRepository {

    private final List<VisitorModel> visitors = new ArrayList<>();

    public VisitorModel save(VisitorModel visitor) {
        visitors.add(visitor);
        return visitor;
    }

    public List<VisitorModel> findAll() {
        return visitors;
    }
}
