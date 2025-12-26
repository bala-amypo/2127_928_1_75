package com.example.demo.service.impl;

import com.example.demo.model.VisitLog;
import com.example.demo.model.Visitor;
import com.example.demo.service.VisitLogService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class VisitLogServiceImpl implements VisitLogService {

    @Override
    public VisitLog logVisit(Visitor visitor, LocalDateTime entry, LocalDateTime exit) {
        VisitLog log = new VisitLog();
        log.setVisitor(visitor);
        log.setEntryTime(entry);
        log.setExitTime(exit);
        return log;
    }
}
