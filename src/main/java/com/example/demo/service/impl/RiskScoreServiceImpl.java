package com.example.demo.service.impl;

import com.example.demo.model.RiskScore;
import com.example.demo.model.RiskRule;
import com.example.demo.service.RiskScoreService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RiskScoreServiceImpl implements RiskScoreService {

    @Override
    public RiskScore calculateRiskScore(List<RiskRule> rules) {
        int total = 0;
        for (RiskRule rule : rules) {
            total += rule.getScore();  // assuming RiskRule has getScore()
        }

        // Build RiskScore object using builder
        RiskScore score = RiskScore.builder()
                .totalScore(total)          // must match field name in RiskScore
                .ruleName("Aggregated Score")
                .userId(1L)                 // example userId, change as needed
                .build();

        return score;
    }
}
