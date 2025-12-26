package com.example.demo.service;

import com.example.demo.model.VisitLog;

public interface VisitLogService {

    VisitLog createVisitLog(Long visitorId, VisitLog log);
}
