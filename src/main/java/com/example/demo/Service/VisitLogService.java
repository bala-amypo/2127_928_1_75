package com.example.demo.service;

import com.example.demo.entity.VisitLogEntity;
import com.example.demo.exception.BadRequestException;
import com.example.demo.repository.VisitLogRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class VisitLogService {

    private final VisitLogRepository visitLogRepository;

    // ✅ Constructor Injection (MANDATORY)
    public VisitLogService(VisitLogRepository visitLogRepository) {
        this.visitLogRepository = visitLogRepository;
    }

    // ✅ Create Visit Log
    public VisitLogEntity createVisitLog(VisitLogEntity visitLog) {

        // 🔴 purpose required
        if (visitLog.getPurpose() == null || visitLog.getPurpose().isEmpty()) {
            throw new BadRequestException("Purpose required");
        }

        // 🔴 location required
        if (visitLog.getLocation() == null || visitLog.getLocation().isEmpty()) {
            throw new BadRequestException("Location required");
        }

        // 🔴 entryTime auto-generated
        if (visitLog.getEntryTime() == null) {
            visitLog.setEntryTime(LocalDateTime.now());
        }

        // 🔴 exitTime must be after entryTime
        if (visitLog.getExitTime() != null &&
                visitLog.getExitTime().isBefore(visitLog.getEntryTime())) {
            throw new BadRequestException("Exit time must be after entry time");
        }

        return visitLogRepository.save(visitLog);
    }

    // ✅ Get all visit logs
    public List<VisitLogEntity> getAllVisitLogs() {
        return visitLogRepository.findAll();
    }

    // ✅ Get visit logs by visitor
    public List<VisitLogEntity> getLogsByVisitorId(Long visitorId) {
        return visitLogRepository.findByVisitorId(visitorId);
    }
}
