package com.example.demo.service;

import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class RiskRuleServiceImpl implements RiskRuleService {

    // Example in-memory risk rules map
    private final Map<String, String> riskRules = new HashMap<>();

    public RiskRuleServiceImpl() {
        // Initialize some sample rules
        riskRules.put("visitor1", "LOW");
        riskRules.put("visitor2", "MEDIUM");
        riskRules.put("visitor3", "HIGH");
        riskRules.put("visitor4", "CRITICAL");
    }

    @Override
    public String getRiskLevel(String key) {
        return riskRules.getOrDefault(key, "LOW"); // Default to LOW if key not found
    }

    // Example method to add/update a rule
    public void setRiskLevel(String key, String level) {
        riskRules.put(key, level);
    }

    // Example method to delete a rule
    public void deleteRiskRule(String key) {
        riskRules.remove(key);
    }
}
