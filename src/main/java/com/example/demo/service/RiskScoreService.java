package com.example.demo.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.example.demo.model.RiskScoreModel;
import com.example.demo.repository.RiskScoreRepository;

@Service
public class RiskScoreService {

    private final RiskScoreRepository riskScoreRepository;

    public RiskScoreService(RiskScoreRepository riskScoreRepository) {
        this.riskScoreRepository = riskScoreRepository;
    }

    public RiskScoreModel saveScore(RiskScoreModel score) {
        score.setCalculatedAt(LocalDateTime.now());
        return riskScoreRepository.save(score);
    }
}
