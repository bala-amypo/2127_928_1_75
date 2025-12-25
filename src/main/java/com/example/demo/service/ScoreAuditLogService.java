package com.example.demo.service;

import com.example.demo.model.ScoreAuditLogModel;
import com.example.demo.model.RiskScoreModel;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class ScoreAuditLogService {

    private final List<ScoreAuditLogModel> logs = new ArrayList<>();

    public void log(RiskScoreModel riskScore) {
        ScoreAuditLogModel log = new ScoreAuditLogModel();
        log.setRiskScoreId(riskScore.getId());
        log.setAction("SCORE_CALCULATED");
        log.setTimestamp(LocalDateTime.now());

        logs.add(log);
    }

    public List<ScoreAuditLogModel> getAll() {
        return logs;
    }
}
