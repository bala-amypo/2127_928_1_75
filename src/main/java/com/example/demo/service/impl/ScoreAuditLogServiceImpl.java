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
    public ScoreAuditLog save(ScoreAuditLog log) {
        return repo.save(log);
    }

    @Override
    public ScoreAuditLog getLog(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("ScoreAuditLog not found"));
    }

    @Override
    public List<ScoreAuditLog> getLogsByVisitor(Long userId) {
        return repo.findByUser_Id(userId);
    }

    @Override
    public ScoreAuditLog logScoreChange(Long userId, Long scoreId, ScoreAuditLog log) {
        log.setScoreId(scoreId);
        log.setCreatedAt(LocalDateTime.now());
        return repo.save(log);
    }
}
