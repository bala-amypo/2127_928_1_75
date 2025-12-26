package com.example.demo.service.impl;

import com.example.demo.model.ScoreAuditLog;
import com.example.demo.repository.ScoreAuditLogRepository;
import com.example.demo.service.ScoreAuditLogService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ScoreAuditLogServiceImpl implements ScoreAuditLogService {

    private final ScoreAuditLogRepository repository;

    public ScoreAuditLogServiceImpl(ScoreAuditLogRepository repository) {
        this.repository = repository;
    }

    @Override
    public ScoreAuditLog logScoreChange(long visitorId, Long scoreId, Object reason) {

        ScoreAuditLog log = new ScoreAuditLog();
        log.setVisitorId(visitorId);
        log.setScoreId(scoreId);
        log.setReason(reason == null ? null : reason.toString());
        log.setCreatedAt(LocalDateTime.now());

        return repository.save(log);
    }

    @Override
    public ScoreAuditLog getLog(long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<ScoreAuditLog> getLogsByVisitor(long visitorId) {
        return repository.findByVisitorId(visitorId);
    }
}
