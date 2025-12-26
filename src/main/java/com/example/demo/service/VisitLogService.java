package com.example.demo.service;

import com.example.demo.model.VisitLog;
import java.util.List;

public interface VisitLogService {
    VisitLog createVisitLog(Long userId, VisitLog log);
    VisitLog getLog(Long id);
    List<VisitLog> getLogsByVisitor(Long userId);
}
