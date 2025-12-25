package com.example.demo.service;

import com.example.demo.model.VisitorModel;
import com.example.demo.repository.VisitorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitorService {

    private final VisitorRepository repository;

    public VisitorService(VisitorRepository repository) {
        this.repository = repository;
    }

    public VisitorModel createVisitor(VisitorModel visitor) {
        return repository.save(visitor);
    }

    public List<VisitorModel> getAllVisitors() {
        return repository.findAll();
    }
}
