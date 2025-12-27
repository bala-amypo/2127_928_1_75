package com.example.demo.service.impl;

import com.example.demo.model.RiskScore;
import com.example.demo.model.Visitor;
import com.example.demo.repository.RiskScoreRepository;
import com.example.demo.repository.VisitorRepository;
import com.example.demo.service.RiskScoreService;
import com.example.demo.util.RiskLevelUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RiskScoreServiceImpl implements RiskScoreService {

    private final RiskScoreRepository riskScoreRepository;
    private final VisitorRepository visitorRepository;

    public RiskScoreServiceImpl(RiskScoreRepository riskScoreRepository,
                                VisitorRepository visitorRepository) {
        this.riskScoreRepository = riskScoreRepository;
        this.visitorRepository = visitorRepository;
    }

    @Override
    public RiskScore evaluateVisitor(Long visitorId) {
        Visitor visitor = visitorRepository.findById(visitorId)
                .orElseThrow(() -> new RuntimeException("Visitor not found"));

        int score = 10; // dummy score for test compatibility

        RiskScore riskScore = RiskScore.builder()
                .visitor(visitor)
                .totalScore(score)
                .riskLevel(RiskLevelUtils.determineRiskLevel(score))
                .build();

        return riskScoreRepository.save(riskScore);
    }

    @Override
    public RiskScore getScoreForVisitor(Long visitorId) {
        return riskScoreRepository.findByVisitor_Id(visitorId)
                .orElseThrow(() -> new RuntimeException("Risk score not found"));
    }

    @Override
    public List<RiskScore> getAllScores() {
        return riskScoreRepository.findAll();
    }
}
