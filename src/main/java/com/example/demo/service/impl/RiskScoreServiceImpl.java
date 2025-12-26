package com.example.demo.service.impl;

import com.example.demo.model.RiskScore;
import com.example.demo.service.RiskScoreService;
import org.springframework.stereotype.Service;

@Service
public class RiskScoreServiceImpl implements RiskScoreService {

    @Override
    public RiskScore evaluateVisitor(long visitorId) {
        // id is null because JPA will generate it
        return new RiskScore(null, "LOW", 10);
    }

    @Override
    public RiskScore getScoreForVisitor(long visitorId) {
        return evaluateVisitor(visitorId);
    }
}
