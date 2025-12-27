package com.example.demo.service.impl;

import com.example.demo.model.VisitLog;
import com.example.demo.model.Visitor;
import com.example.demo.repository.VisitLogRepository;
import com.example.demo.repository.VisitorRepository;
import com.example.demo.service.VisitLogService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitLogServiceImpl implements VisitLogService {

    private final VisitLogRepository visitLogRepository;
    private final VisitorRepository visitorRepository;

    public VisitLogServiceImpl(VisitLogRepository visitLogRepository,
                              VisitorRepository visitorRepository) {
        this.visitLogRepository = visitLogRepository;
        this.visitorRepository = visitorRepository;
    }

    @Override
    public VisitLog createVisitLog(Long visitorId, VisitLog log) {
        Visitor visitor = visitorRepository.findById(visitorId)
                .orElseThrow(() -> new RuntimeException("Visitor not found"));

        log.setVisitor(visitor);
        return visitLogRepository.save(log);
    }

    @Override
    public VisitLog getLog(Long id) {
        return visitLogRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Visit log not found"));
    }

    @Override
    public List<VisitLog> getLogsByVisitor(Long visitorId) {
        return visitLogRepository.findByVisitor_Id(visitorId);
    }
}
