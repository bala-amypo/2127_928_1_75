package com.example.demo.service;

public interface RiskRuleService {
    String getRiskLevel(String key);
    void setRiskLevel(String key, String level);
    void deleteRiskRule(String key);
}
