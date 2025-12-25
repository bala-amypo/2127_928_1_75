package com.example.demo.service;

import com.example.demo.model.VisitLogModel;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class VisitLogService {

    // Example method to create a visit log
    public VisitLogModel createVisitLog(Long visitorId) {
        VisitLogModel visitLog = new VisitLogModel();
        visitLog.setVisitorId(visitorId);
        visitLog.setEntryTime(LocalDateTime.now());

        return visitLog;
    }
}
