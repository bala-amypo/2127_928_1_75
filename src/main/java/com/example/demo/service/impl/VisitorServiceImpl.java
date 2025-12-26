package com.example.demo.service.impl;

import com.example.demo.model.Visitor;
import com.example.demo.repository.VisitorRepository;
import com.example.demo.service.VisitorService;

import java.util.List;

public class VisitorServiceImpl implements VisitorService {

    private final VisitorRepository repo;

    public VisitorServiceImpl(VisitorRepository repo) {
        this.repo = repo;
    }

    @Override
    public Visitor createVisitor(Visitor visitor) {
        return repo.save(visitor);
    }

    @Override
    public Visitor getVisitor(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("not found"));
    }

    @Override
    public List<Visitor> getAllVisitors() {
        return repo.findAll();
    }
}
