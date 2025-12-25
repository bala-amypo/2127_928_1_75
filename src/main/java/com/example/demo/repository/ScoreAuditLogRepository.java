package com.example.demo.repository;

import com.example.demo.model.ScoreAuditLogModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ScoreAuditLogRepository {

    private final List<ScoreAuditLogModel> logs = new ArrayList<>();

    public ScoreAuditLogModel save(ScoreAuditLogModel log) {
        logs.add(log);
        return log;
    }

    public List<ScoreAuditLogModel> findAll() {
        return logs;
    }
}
