package com.example.demo.service.impl;

import com.example.demo.model.ScoreAuditLog;
import com.example.demo.service.ScoreAuditLogService;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ScoreAuditLogServiceImpl implements ScoreAuditLogService {

    @Override
    public List<ScoreAuditLog> getAllLogs() {
        List<ScoreAuditLog> list = new ArrayList<>();
        list.add(new ScoreAuditLog(1L, 1L, "LOW"));
        return list;
    }
}
