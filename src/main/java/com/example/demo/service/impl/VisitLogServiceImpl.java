package com.example.demo.service.impl;

import com.example.demo.model.VisitLog;
import com.example.demo.repository.VisitLogRepository;
import com.example.demo.service.VisitLogService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitLogServiceImpl implements VisitLogService {

    private final VisitLogRepository repo;

    public VisitLogServiceImpl(VisitLogRepository repo) {
        this.repo = repo;
    }

    @Override
    public VisitLog save(VisitLog log) {
        return repo.save(log);
    }

    @Override
    public VisitLog getLog(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("VisitLog not found with id " + id));
    }

    @Override
    public List<VisitLog> getLogsByVisitor(Long userId) {
        return repo.findByUser_Id(userId);
    }
}
