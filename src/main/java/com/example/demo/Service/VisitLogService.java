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

    public VisitLogService(VisitLogRepository visitLogRepository) {
        this.visitLogRepository = visitLogRepository;
    }

    public VisitLogEntity createVisitLog(VisitLogEntity visitLog) {

        if (visitLog.getPurpose() == null || visitLog.getPurpose().isEmpty()) {
            throw new BadRequestException("Purpose required");
        }

        if (visitLog.getLocation() == null || visitLog.getLocation().isEmpty()) {
            throw new BadRequestException("Location required");
        }

        if (visitLog.getEntryTime() == null) {
            visitLog.setEntryTime(LocalDateTime.now());
        }

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
