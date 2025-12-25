package com.example.demo.service;

import com.example.demo.model.RiskRuleModel;
import com.example.demo.model.RiskScoreModel;
import com.example.demo.model.VisitLogModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RiskScoreService {

    public RiskScoreModel calculateRiskScore(
            VisitLogModel visitLog,
            List<RiskRuleModel> rules) {

        int total = rules.stream().mapToInt(RiskRuleModel::getScore).sum();

        RiskScoreModel score = new RiskScoreModel();
        score.setVisitLogId(visitLog.getId());
        score.setScore(total);

        return score;
    }
}
