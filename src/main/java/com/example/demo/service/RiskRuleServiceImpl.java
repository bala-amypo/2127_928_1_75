package com.example.demo.service;

import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class RiskRuleServiceImpl implements RiskRuleService {

    private final Map<String, String> riskRules = new HashMap<>();

    public RiskRuleServiceImpl() {
        riskRules.put("visitor1", "LOW");
        riskRules.put("visitor2", "MEDIUM");
        riskRules.put("visitor3", "HIGH");
        riskRules.put("visitor4", "CRITICAL");
    }

    @Override
    public String getRiskLevel(String key) {
        return riskRules.getOrDefault(key, "LOW");
    }

    @Override
    public void setRiskLevel(String key, String level) {
        riskRules.put(key, level);
    }

    @Override
    public void deleteRiskRule(String key) {
        riskRules.remove(key);
    }
}
