package com.example.demo.service.impl;

import com.example.demo.model.RiskScore;
import com.example.demo.repository.RiskScoreRepository;
import com.example.demo.service.RiskScoreService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RiskScoreServiceImpl implements RiskScoreService {

    private final RiskScoreRepository repository;

    public RiskScoreServiceImpl(RiskScoreRepository repository) {
        this.repository = repository;
    }

    @Override
    public RiskScore save(RiskScore score) {
        return repository.save(score);
    }

    @Override
    public RiskScore getScoreForVisitor(long visitorId) {
        return repository.findByVisitorId(visitorId)
                .orElse(null);
    }

    @Override
    public List<RiskScore> getAllScores() {
        return repository.findAll();
    }
}
