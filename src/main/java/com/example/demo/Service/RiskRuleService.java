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

    // ✅ Constructor Injection (MANDATORY)
    public RiskRuleService(RiskRuleRepository riskRuleRepository) {
        this.riskRuleRepository = riskRuleRepository;
    }

    // ✅ Create Risk Rule
    public RiskRuleEntity createRule(RiskRuleEntity rule) {

        // 🔴 Rule name must be unique
        if (riskRuleRepository.existsByRuleName(rule.getRuleName())) {
            throw new BadRequestException("Rule name must be unique");
        }

        // 🔴 threshold >= 0
        if (rule.getThreshold() < 0) {
            throw new BadRequestException("Threshold must be non-negative");
        }

        // 🔴 scoreImpact >= 0
        if (rule.getScoreImpact() < 0) {
            throw new BadRequestException("Score impact must be non-negative");
        }

        rule.setCreatedAt(LocalDateTime.now());
        return riskRuleRepository.save(rule);
    }

    // ✅ Get all rules
    public List<RiskRuleEntity> getAllRules() {
        return riskRuleRepository.findAll();
    }

    // ✅ Get rule by ID
    public RiskRuleEntity getRuleById(Long id) {
        return riskRuleRepository.findById(id)
                .orElseThrow(() ->
                        new BadRequestException("Rule not found"));
    }

    // ✅ Delete rule
    public void deleteRule(Long id) {
        if (!riskRuleRepository.existsById(id)) {
            throw new BadRequestException("Rule not found");
        }
        riskRuleRepository.deleteById(id);
    }
}
