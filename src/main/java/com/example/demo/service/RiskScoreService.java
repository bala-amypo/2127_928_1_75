package com.example.demo.service;

import com.example.demo.model.RiskRuleModel;
import com.example.demo.model.RiskScoreModel;
import com.example.demo.model.VisitLogModel;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class RiskScoreService {

    // Example method to calculate risk score
    public RiskScoreModel calculateRiskScore(VisitLogModel visitLog, List<RiskRuleModel> rules) {
        int totalScore = 0;
        for (RiskRuleModel rule : rules) {
            totalScore += rule.getScoreImpact();
        }

        RiskScoreModel riskScore = new RiskScoreModel();
        riskScore.setVisitLogId(visitLog.getId());
        riskScore.setScore(totalScore);

        return riskScore;
    }
}
