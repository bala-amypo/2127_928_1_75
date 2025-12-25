package com.example.demo.service;

import com.example.demo.entity.VisitorEntity;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.VisitorRepository;
import org.springframework.stereotype.Service;

@Service
public class VisitorService {

    private final VisitorRepository visitorRepository;

    public VisitorService(VisitorRepository visitorRepository) {
        this.visitorRepository = visitorRepository;
    }

    public VisitorEntity createVisitor(VisitorEntity visitor) {
        return visitorRepository.save(visitor);
    }

    public VisitorEntity getVisitorById(Long id) {
        return visitorRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Visitor not found"));
    }
}
