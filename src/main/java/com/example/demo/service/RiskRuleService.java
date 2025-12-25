package com.example.demo.service;

import com.example.demo.entity.RiskRuleEntity;
import com.example.demo.repository.RiskRuleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RiskRuleService {

    private final RiskRuleRepository riskRuleRepository;

    public RiskRuleService(RiskRuleRepository riskRuleRepository) {
        this.riskRuleRepository = riskRuleRepository;
    }

    public List<RiskRuleEntity> getActiveRules() {
        return riskRuleRepository.findByActiveTrue();
    }
}
