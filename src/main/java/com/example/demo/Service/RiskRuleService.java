package com.example.demo.service;

import com.example.demo.entity.RiskRuleEntity;
import com.example.demo.exception.BadRequestException;
import com.example.demo.repository.RiskRuleRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class RiskRuleService {

    private final RiskRuleRepository riskRuleRepository;

    public RiskRuleService(RiskRuleRepository riskRuleRepository) {
        this.riskRuleRepository = riskRuleRepository;
    }

    public RiskRuleEntity createRule(RiskRuleEntity rule) {

        if (riskRuleRepository.existsByRuleName(rule.getRuleName())) {
            throw new BadRequestException("Rule name must be unique");
        }

        if (rule.getThreshold() < 0) {
            throw new BadRequestException("Threshold must be non-negative");
        }

        if (rule.getScoreImpact() < 0) {
            throw new BadRequestException("Score impact must be non-negative");
        }

        rule.setCreatedAt(LocalDateTime.now());
        return riskRuleRepository.save(rule);
    }

    public List<RiskRuleEntity> getAllRules() {
        return riskRuleRepository.findAll();
    }

    public RiskRuleEntity getRuleById(Long id) {
        return riskRuleRepository.findById(id)
                .orElseThrow(() ->
                        new BadRequestException("Rule not found"));
    }

    public void deleteRule(Long id) {
        if (!riskRuleRepository.existsById(id)) {
            throw new BadRequestException("Rule not found");
        }
        riskRuleRepository.deleteById(id);
    }
}
