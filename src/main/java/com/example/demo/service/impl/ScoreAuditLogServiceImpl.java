package com.example.demo.service.impl;

import com.example.demo.model.ScoreAuditLog;
import com.example.demo.service.ScoreAuditLogService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ScoreAuditLogServiceImpl implements ScoreAuditLogService {

    private final List<ScoreAuditLog> auditLogs = new ArrayList<>();

    @Override
    public void logScoreChange(Long visitorId, Long riskScoreId, ScoreAuditLog log) {
        log.setVisitorId(visitorId);
        log.setRiskScoreId(riskScoreId);
        auditLogs.add(log);
    }

    @Override
    public ScoreAuditLog getLog(Long id) {
        return auditLogs.stream()
                .filter(log -> log.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<ScoreAuditLog> getLogsByVisitor(Long visitorId) {
        List<ScoreAuditLog> result = new ArrayList<>();
        for (ScoreAuditLog log : auditLogs) {
            if (log.getVisitorId().equals(visitorId)) {
                result.add(log);
            }
        }
        return result;
    }
}
