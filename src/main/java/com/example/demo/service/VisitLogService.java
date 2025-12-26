package com.example.demo.service;

import com.example.demo.model.VisitLog;
import java.util.List;

public interface VisitLogService {

    VisitLog save(VisitLog log);
    List<VisitLog> findAll();
}
