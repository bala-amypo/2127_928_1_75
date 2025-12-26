package com.example.demo.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.example.demo.model.VisitorModel;
import com.example.demo.repository.VisitorRepository;

@Service
public class VisitorService {

    private final VisitorRepository visitorRepository;

    public VisitorService(VisitorRepository visitorRepository) {
        this.visitorRepository = visitorRepository;
    }

    public VisitorModel createVisitor(VisitorModel visitor) {
        visitor.setCreatedAt(LocalDateTime.now());
        return visitorRepository.save(visitor);
    }
}
