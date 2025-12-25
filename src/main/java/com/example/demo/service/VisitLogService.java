package com.example.demo.service;

import com.example.demo.model.VisitLogModel;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class VisitLogService {

    public VisitLogModel createVisitLog(Long visitorId) {
        return VisitLogModel.builder()
                .visitorId(visitorId)
                .entryTime(LocalDateTime.now())
                .build();
    }
}
