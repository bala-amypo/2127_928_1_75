package com.example.demo.service.impl;

import com.example.demo.model.RiskScore;
import com.example.demo.service.RiskScoreService;
import org.springframework.stereotype.Service;

@Service
public class RiskScoreServiceImpl implements RiskScoreService {

    @Override
    public RiskScore evaluateVisitor(Long visitorId) {
        return new RiskScore(null, "LOW", 10);
    }
}
