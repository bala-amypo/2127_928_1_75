package com.example.demo.repository;

import com.example.demo.model.VisitLogModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class VisitLogRepository {

    private final List<VisitLogModel> logs = new ArrayList<>();

    public VisitLogModel save(VisitLogModel log) {
        logs.add(log);
        return log;
    }

    public List<VisitLogModel> findAll() {
        return logs;
    }
}
