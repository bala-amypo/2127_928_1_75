package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.RiskRuleModel;
import com.example.demo.repository.RiskRuleRepository;

@Service
public class RiskRuleService {

    private final RiskRuleRepository riskRuleRepository;

    public RiskRuleService(RiskRuleRepository riskRuleRepository) {
        this.riskRuleRepository = riskRuleRepository;
    }

    public RiskRuleModel createRule(RiskRuleModel rule) {
        return riskRuleRepository.save(rule);
    }
}
