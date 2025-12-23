package com.example.demo.service;

import java.util.Optional;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Visitor;
import com.example.demo.repository.VisitorRepository;

@Service
public class VisitorService {

    private final VisitorRepository repo;

    public VisitorService(VisitorRepository repo) {
        this.repo = repo;
    }

    // POST
    public Visitor saveVisitor(Visitor visitor) {
        return repo.save(visitor);
    }

    // GET by ID
    public Visitor getVisitor(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Visitor not found"));
    }

    // UPDATE
    public Visitor updateVisitor(Long id, Visitor newData) {
        Visitor existing = getVisitor(id);

        existing.setName(newData.getName());
        existing.setAge(newData.getAge());
        existing.setEmail(newData.getEmail());
        existing.setPhone(newData.getPhone());
        existing.setPurpose(newData.getPurpose());

        return repo.save(existing);
    }
}
