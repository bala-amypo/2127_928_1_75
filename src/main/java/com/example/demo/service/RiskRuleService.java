package com.example.demo.service;

/**
 * Service interface for managing risk rules.
 */
public interface RiskRuleService {

    String getRiskLevel(String key);

    void setRiskLevel(String key, String level);

    void deleteRiskRule(String key);
}
