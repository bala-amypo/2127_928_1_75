package com.example.demo.service;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.util.RiskLevelUtils;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class RiskRuleService {

    private final Map<String, String> riskRules = new HashMap<>();

    public RiskRuleService() {
        riskRules.put("visitorWithoutPass", RiskLevelUtils.HIGH);
        riskRules.put("unknownVisitor", RiskLevelUtils.CRITICAL);
    }

    public String getRiskLevel(String ruleKey) {
        if (!riskRules.containsKey(ruleKey)) {
            throw new ResourceNotFoundException("Risk rule not found: " + ruleKey);
        }
        return riskRules.get(ruleKey);
    }

    public void saveOrUpdateRule(String ruleKey, String riskLevel) {
        riskRules.put(ruleKey, riskLevel);
    }

    public void deleteRule(String ruleKey) {
        if (!riskRules.containsKey(ruleKey)) {
            throw new ResourceNotFoundException("Cannot delete. Rule not found: " + ruleKey);
        }
        riskRules.remove(ruleKey);
    }
}
