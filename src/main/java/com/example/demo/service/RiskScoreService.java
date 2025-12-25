package com.example.demo.service;

import com.example.demo.model.RiskRuleModel;
import com.example.demo.model.RiskScoreModel;
import com.example.demo.model.VisitLogModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RiskScoreService {

    public RiskScoreModel calculateRiskScore(List<RiskRuleModel> rules, VisitLogModel visitLog) {
        int totalScore = rules.stream()
                .mapToInt(RiskRuleModel::getScoreImpact) // fixed method reference
                .sum();

        return RiskScoreModel.builder()
                .id(visitLog.getId())
                .visitorId(visitLog.getVisitorId())
                .totalScore(totalScore)
                .build();
    }
}
