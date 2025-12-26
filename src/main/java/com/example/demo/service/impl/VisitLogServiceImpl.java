package com.example.demo.service.impl;

import com.example.demo.model.VisitLog;
import com.example.demo.repository.VisitLogRepository;
import com.example.demo.service.VisitLogService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class VisitLogServiceImpl implements VisitLogService {

    private final VisitLogRepository repository;

    public VisitLogServiceImpl(VisitLogRepository repository) {
        this.repository = repository;
    }

    @Override
    public VisitLog save(VisitLog log) {
        log.setVisitedAt(LocalDateTime.now());
        return repository.save(log);
    }

    @Override
    public VisitLog getLog(long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<VisitLog> getLogsByVisitor(long visitorId) {
        return repository.findByVisitor_Id(visitorId);
    }
}
