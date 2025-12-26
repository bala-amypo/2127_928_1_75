package com.example.demo.service.impl;

import com.example.demo.model.RiskScoreModel;
import com.example.demo.repository.RiskScoreRepository;
import com.example.demo.service.RiskScoreService;
import org.springframework.stereotype.Service;

@Service
public class RiskScoreServiceImpl implements RiskScoreService {

    private final RiskScoreRepository repo;

    public RiskScoreServiceImpl(RiskScoreRepository repo) {
        this.repo = repo;
    }

    @Override
    public RiskScoreModel save(RiskScoreModel score) {
        return repo.save(score);
    }

    @Override
    public RiskScoreModel get(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Risk score not found"));
    }
}
