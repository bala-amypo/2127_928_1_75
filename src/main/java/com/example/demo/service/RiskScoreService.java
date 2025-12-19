package com.example.demo.service;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.util.RiskLevelUtils;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class RiskScoreService {

    private final Map<Long, String> riskScores = new HashMap<>();
    private long counter = 1;

    public Long addScore(String level) {
        long id = counter++;
        if (!isValidRiskLevel(level)) {
            throw new ResourceNotFoundException("Invalid risk level: " + level);
        }
        riskScores.put(id, level);
        return id;
    }

    public String getScore(Long id) {
        String score = riskScores.get(id);
        if (score == null) throw new ResourceNotFoundException("Score not found for ID: " + id);
        return score;
    }

    private boolean isValidRiskLevel(String level) {
        return level.equals(RiskLevelUtils.LOW) ||
               level.equals(RiskLevelUtils.MEDIUM) ||
               level.equals(RiskLevelUtils.HIGH) ||
               level.equals(RiskLevelUtils.CRITICAL);
    }
}
