package com.example.demo.service;

import com.example.demo.entity.*;
import com.example.demo.exception.BadRequestException;
import com.example.demo.repository.*;
import com.example.demo.util.RiskLevelUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class RiskScoreService {

    private final RiskRuleRepository riskRuleRepository;
    private final RiskScoreRepository riskScoreRepository;
    private final ScoreAuditLogRepository scoreAuditLogRepository;

    // ✅ Constructor Injection (MANDATORY)
    public RiskScoreService(RiskRuleRepository riskRuleRepository,
                            RiskScoreRepository riskScoreRepository,
                            ScoreAuditLogRepository scoreAuditLogRepository) {
        this.riskRuleRepository = riskRuleRepository;
        this.riskScoreRepository = riskScoreRepository;
        this.scoreAuditLogRepository = scoreAuditLogRepository;
    }

    // ✅ Evaluate visitor against all active rules
    public RiskScoreEntity evaluateVisitor(VisitorEntity visitor) {

        if (visitor == null) {
            throw new BadRequestException("Visitor required");
        }

        List<RiskRuleEntity> rules = riskRuleRepository.findAll();
        int totalScore = 0;

        for (RiskRuleEntity rule : rules) {

            boolean ruleApplied = applyRule(rule, visitor);

            if (ruleApplied) {
                totalScore += rule.getScoreImpact();

                // ✅ Save audit log
                ScoreAuditLogEntity audit = ScoreAuditLogEntity.builder()
                        .visitor(visitor)
                        .appliedRule(rule)
                        .scoreChange(rule.getScoreImpact())
                        .reason(rule.getRuleName())
                        .build();

                scoreAuditLogRepository.save(audit);
            }
        }

        // ✅ Derive risk level
        String riskLevel = RiskLevelUtils.fromScore(totalScore);

        RiskScoreEntity riskScore = RiskScoreEntity.builder()
                .visitor(visitor)
                .totalScore(totalScore)
                .riskLevel(riskLevel)
                .evaluatedAt(LocalDateTime.now())
                .build();

        return riskScoreRepository.save(riskScore);
    }

    // ✅ Rule evaluation logic
    private boolean applyRule(RiskRuleEntity rule, VisitorEntity visitor) {

        switch (rule.getRuleType()) {

            case "AFTER_HOURS":
                int hour = LocalDateTime.now().getHour();
                return hour >= rule.getThreshold();

            case "FREQUENT_VISITS":
                return visitor.getVisitCount() >= rule.getThreshold();

            case "BLACKLIST":
                return visitor.isBlacklisted();

            case "KEYWORD":
                return visitor.getName() != null &&
                        visitor.getName().toLowerCase()
                                .contains(rule.getRuleName().toLowerCase());

            case "CUSTOM":
                return rule.getThreshold() > 0;

            default:
                return false;
        }
    }
}
