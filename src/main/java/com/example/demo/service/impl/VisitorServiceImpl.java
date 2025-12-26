package com.example.demo.service.impl;

import com.example.demo.model.Visitor;
import com.example.demo.repository.VisitorRepository;
import com.example.demo.service.VisitorService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class VisitorServiceImpl implements VisitorService {

    private final VisitorRepository repo;

    public VisitorServiceImpl(VisitorRepository repo) {
        this.repo = repo;
    }

    @Override
    public Visitor createVisitor(Visitor v) {
        if (v.getPhone() == null) throw new IllegalArgumentException("phone required");
        return repo.save(v);
    }

    @Override
    public Visitor getVisitor(Long id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException("not found"));
    }

    @Override
    public List<Visitor> getAllVisitors() {
        return repo.findAll();
    }
}
