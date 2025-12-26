package com.example.demo.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.example.demo.model.VisitLogModel;
import com.example.demo.repository.VisitLogRepository;

@Service
public class VisitLogService {

    private final VisitLogRepository visitLogRepository;

    public VisitLogService(VisitLogRepository visitLogRepository) {
        this.visitLogRepository = visitLogRepository;
    }

    public VisitLogModel logVisit(VisitLogModel visitLog) {
        visitLog.setEntryTime(LocalDateTime.now());
        return visitLogRepository.save(visitLog);
    }
}
