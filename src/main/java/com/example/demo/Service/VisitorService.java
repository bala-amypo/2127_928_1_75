package com.example.demo.service;

import com.example.demo.entity.VisitorEntity;
import com.example.demo.exception.BadRequestException;
import com.example.demo.repository.VisitorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitorService {

    private final VisitorRepository visitorRepository;

    public VisitorService(VisitorRepository visitorRepository) {
        this.visitorRepository = visitorRepository;
    }

    public VisitorEntity createVisitor(VisitorEntity visitor) {

        if (visitor.getPhone() == null || visitor.getPhone().isEmpty()) {
            throw new BadRequestException("Phone required");
        }

        if (visitor.getIdProof() == null || visitor.getIdProof().isEmpty()) {
            throw new BadRequestException("Id proof required");
        }

        return visitorRepository.save(visitor);
    }

    public List<VisitorEntity> getAllVisitors() {
        return visitorRepository.findAll();
    }

    public VisitorEntity getVisitorById(Long id) {
        return visitorRepository.findById(id)
                .orElseThrow(() ->
                        new BadRequestException("Visitor not found"));
    }

    public void deleteVisitor(Long id) {
        if (!visitorRepository.existsById(id)) {
            throw new BadRequestException("Visitor not found");
        }
        visitorRepository.deleteById(id);
    }
}
