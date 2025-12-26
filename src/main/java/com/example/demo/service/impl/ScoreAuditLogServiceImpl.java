package com.example.demo.service.impl;

import com.example.demo.model.ScoreAuditLog;
import com.example.demo.repository.ScoreAuditLogRepository;
import com.example.demo.service.ScoreAuditLogService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ScoreAuditLogServiceImpl implements ScoreAuditLogService {

    private final ScoreAuditLogRepository repo;

    public ScoreAuditLogServiceImpl(ScoreAuditLogRepository repo) {
        this.repo = repo;
    }

    @Override
    public ScoreAuditLog create(Long visitorId, Long scoreId, int scoreChange, String reason) {

        ScoreAuditLog log = ScoreAuditLog.builder()
                .visitorId(visitorId)
                .scoreId(scoreId)
                .scoreChange(scoreChange)
                .reason(reason)
                .createdAt(LocalDateTime.now())
                .build();

        return repo.save(log);
    }

    @Override
    public List<ScoreAuditLog> getByVisitor(Long visitorId) {
        return repo.findByVisitorId(visitorId);
    }
}
