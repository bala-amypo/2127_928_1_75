package com.example.demo.service;

import com.example.demo.entity.VisitLogEntity;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.VisitLogRepository;
import com.example.demo.repository.VisitorRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class VisitLogService {

    private final VisitLogRepository visitLogRepository;
    private final VisitorRepository visitorRepository;

    public VisitLogService(VisitLogRepository visitLogRepository,
                           VisitorRepository visitorRepository) {
        this.visitLogRepository = visitLogRepository;
        this.visitorRepository = visitorRepository;
    }

    public VisitLogEntity createVisitLog(Long visitorId, VisitLogEntity visitLog) {

        visitorRepository.findById(visitorId)
                .orElseThrow(() -> new ResourceNotFoundException("Visitor not found"));

        visitLog.setVisitorId(visitorId);
        visitLog.setEntryTime(LocalDateTime.now());

        return visitLogRepository.save(visitLog);
    }
}
