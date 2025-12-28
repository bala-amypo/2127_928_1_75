package com.example.demo.service;

import com.example.demo.entity.RiskRule;

import java.util.List;

public interface RiskRuleService {
    String calculateRiskLevel(Long visitorId);
    List<RiskRule> getAllRules();
}
