package com.example.demo.service.impl;

import com.example.demo.model.ScoreAuditLog;
import com.example.demo.repository.ScoreAuditLogRepository;
import com.example.demo.service.ScoreAuditLogService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreAuditLogServiceImpl implements ScoreAuditLogService {

    private final ScoreAuditLogRepository repository;

    public ScoreAuditLogServiceImpl(ScoreAuditLogRepository repository) {
        this.repository = repository;
    }

    @Override
    public void logScoreChange(Long visitorId, Long riskScoreId, ScoreAuditLog log) {
        log.setVisitorId(visitorId);
        log.setRiskScoreId(riskScoreId);
        repository.save(log);
    }

    @Override
    public ScoreAuditLog getLog(Long logId) {
        return repository.findById(logId).orElse(null);
    }

    @Override
    public List<ScoreAuditLog> getLogsByVisitor(Long visitorId) {
        return repository.findByVisitorId(visitorId);
    }
}
