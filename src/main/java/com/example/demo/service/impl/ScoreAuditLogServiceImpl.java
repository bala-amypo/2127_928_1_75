package com.example.demo.service.impl;

import com.example.demo.model.ScoreAuditLog;
import com.example.demo.repository.ScoreAuditLogRepository;
import com.example.demo.service.ScoreAuditLogService;

import java.util.Collections;
import java.util.List;

public class ScoreAuditLogServiceImpl implements ScoreAuditLogService {

    private final ScoreAuditLogRepository repo;

    public ScoreAuditLogServiceImpl(ScoreAuditLogRepository repo) {
        this.repo = repo;
    }

    @Override
    public ScoreAuditLog logScoreChange(Long visitorId, Long ruleId, ScoreAuditLog log) {
        if (log.getReason() == null || log.getReason().isEmpty()) {
            throw new IllegalArgumentException("reason required");
        }
        if (log.getScoreChange() < 0) {
            throw new IllegalArgumentException("scoreChange must be >= 0");
        }
        return repo.save(log);
    }

    @Override
    public ScoreAuditLog getLog(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("not found"));
    }

    @Override
    public List<ScoreAuditLog> getLogsByVisitor(Long visitorId) {
        return Collections.emptyList();
    }
}
