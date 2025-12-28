package com.example.demo.service.impl;

import com.example.demo.service.RiskRuleService;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class RiskRuleServiceImpl implements RiskRuleService {

    @Override
    public String calculateRiskLevel(Long visitorId) {
        return "LOW"; // stub value
    }

    @Override
    public List<Object> getAllRules() {
        return Collections.emptyList(); // stub value
    }
}
