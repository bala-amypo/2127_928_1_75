package com.example.demo.service;

import com.example.demo.entity.*;
import com.example.demo.repository.RiskRuleRepository;
import com.example.demo.repository.RiskScoreRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RiskScoreService {

    private final RiskScoreRepository riskScoreRepository;
    private final RiskRuleRepository riskRuleRepository;
    private final ScoreAuditLogService scoreAuditLogService;

    public RiskScoreService(RiskScoreRepository riskScoreRepository,
                            RiskRuleRepository riskRuleRepository,
                            ScoreAuditLogService scoreAuditLogService) {
        this.riskScoreRepository = riskScoreRepository;
        this.riskRuleRepository = riskRuleRepository;
        this.scoreAuditLogService = scoreAuditLogService;
    }

    public RiskScoreEntity calculateRiskScore(VisitLogEntity visitLogEntity) {

        List<RiskRuleEntity> rules = riskRuleRepository.findByActiveTrue();

        int totalScore = rules.stream()
                .mapToInt(RiskRuleEntity::getScoreImpact)
                .sum();

        String level = totalScore >= 70 ? "HIGH"
                : totalScore >= 40 ? "MEDIUM"
                : "LOW";

        RiskScoreEntity riskScore = RiskScoreEntity.builder()
                .visitId(visitLogEntity.getId())
                .score(totalScore)
                .riskLevel(level)
                .build();

        riskScoreRepository.save(riskScore);

        scoreAuditLogService.logScoreChange(
                visitLogEntity.getId(), 0, totalScore
        );

        return riskScore;
    }
}
