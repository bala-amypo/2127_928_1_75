package com.example.demo.service.impl;

import com.example.demo.service.RiskRuleService;
import org.springframework.stereotype.Service;

@Service
public class RiskRuleServiceImpl implements RiskRuleService {

    @Override
    public String calculateRiskLevel(Long visitorId) {
        return "LOW"; // stub value
    }

    @Override
    public java.util.List getAllRules() {
        return java.util.Collections.emptyList(); // stub value
    }
}
