package com.example.demo.service.impl;

import com.example.demo.model.VisitLog;
import com.example.demo.repository.VisitLogRepository;
import com.example.demo.service.VisitLogService;

import java.util.List;

public class VisitLogServiceImpl implements VisitLogService {

    private final VisitLogRepository repo;

    public VisitLogServiceImpl(VisitLogRepository repo) {
        this.repo = repo;
    }

    @Override
    public VisitLog createVisitLog(Long visitorId, VisitLog log) {
        if (log.getExitTime() != null && log.getEntryTime() != null &&
                log.getExitTime().isBefore(log.getEntryTime())) {
            throw new IllegalArgumentException("exitTime must be after entryTime");
        }
        return repo.save(log);
    }

    @Override
    public VisitLog getLog(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("not found"));
    }

    @Override
    public List<VisitLog> getLogsByVisitor(Long visitorId) {
        return repo.findAll();
    }
}
