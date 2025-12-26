package com.example.demo.service.impl;

import com.example.demo.model.ScoreAuditLog;
import com.example.demo.repository.ScoreAuditLogRepository;
import com.example.demo.service.ScoreAuditLogService;
import org.springframework.stereotype.Service;
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
    public List<ScoreAuditLog> findAll() {
        return repo.findAll();
    }
}
