package com.example.demo.service;

import java.util.List;

public interface RiskRuleService {
    String calculateRiskLevel(Long visitorId);
    List<Object> getAllRules();
}
