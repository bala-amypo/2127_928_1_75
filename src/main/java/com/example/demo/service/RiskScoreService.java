package com.example.demo.service;

import com.example.demo.model.RiskScore;

public interface RiskScoreService {

    RiskScore evaluateVisitor(long visitorId);

    RiskScore getScoreForVisitor(long visitorId);
}
