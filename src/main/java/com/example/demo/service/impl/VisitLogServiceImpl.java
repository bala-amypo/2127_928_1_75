package com.example.demo.service.impl;

import com.example.demo.model.VisitLog;
import com.example.demo.model.Visitor;
import com.example.demo.repository.VisitLogRepository;
import com.example.demo.repository.VisitorRepository;
import com.example.demo.service.VisitLogService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;

@Service
public class VisitLogServiceImpl implements VisitLogService {

    private final VisitLogRepository repo;
    private final VisitorRepository visitorRepo;

    public VisitLogServiceImpl(VisitLogRepository repo, VisitorRepository visitorRepo) {
        this.repo = repo;
        this.visitorRepo = visitorRepo;
    }

    @Override
    public VisitLog createVisitLog(Long visitorId, VisitLog log) {
        if (log.getExitTime() != null && log.getExitTime().isBefore(log.getEntryTime()))
            throw new IllegalArgumentException("exitTime must be after entryTime");

        Visitor v = visitorRepo.findById(visitorId).orElseThrow(() -> new RuntimeException("not found"));
        log.setVisitor(v);
        if (log.getEntryTime() == null) log.setEntryTime(LocalDateTime.now());
        return repo.save(log);
    }

    @Override
    public VisitLog getLog(Long id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException("not found"));
    }

    @Override
    public List<VisitLog> getLogsByVisitor(Long visitorId) {
        return repo.findAll(); // dummy list
    }
}
