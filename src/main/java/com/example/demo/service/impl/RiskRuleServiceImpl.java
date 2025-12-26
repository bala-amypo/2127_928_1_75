package com.example.demo.service.impl;

import com.example.demo.model.RiskScoreModel;
import com.example.demo.repository.RiskScoreRepository;
import com.example.demo.service.RiskScoreService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RiskScoreServiceImpl implements RiskScoreService {

    private final RiskScoreRepository repo;

    public RiskScoreServiceImpl(RiskScoreRepository repo) {
        this.repo = repo;
    }

    @Override
    public RiskScoreModel createScore(RiskScoreModel score) {
        return repo.save(score);
    }

    @Override
    public RiskScoreModel getScore(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Score not found"));
    }

    @Override
    public List<RiskScoreModel> getAllScores() {
        return repo.findAll();
    }
}
