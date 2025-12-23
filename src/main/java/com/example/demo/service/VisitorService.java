package com.example.demo.service;

import org.springframework.stereotype.Service;
import com.example.demo.entity.Visitor;
import com.example.demo.repository.VisitorRepository;

@Service
public class VisitorService {

    private final VisitorRepository repository;

    public VisitorService(VisitorRepository repository) {
        this.repository = repository;
    }

    // CREATE
    public Visitor save(Visitor visitor) {
        return repository.save(visitor);
    }

    // READ
    public Visitor getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Visitor not found"));
    }

    // UPDATE
    public Visitor update(Long id, Visitor data) {
        Visitor existing = getById(id);

        existing.setName(data.getName());
        existing.setAge(data.getAge());
        existing.setEmail(data.getEmail());
        existing.setPhone(data.getPhone());
        existing.setPurpose(data.getPurpose());

        return repository.save(existing);
    }
}
