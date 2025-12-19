package com.example.demo.service;

import com.example.demo.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class VisitLogService {

    private final Map<Long, String> visitLogs = new HashMap<>();
    private long counter = 1;

    public Long logVisit(String details) {
        long id = counter++;
        visitLogs.put(id, details);
        return id;
    }

    public String getVisitLog(Long id) {
        if (!visitLogs.containsKey(id)) throw new ResourceNotFoundException("Visit log not found: " + id);
        return visitLogs.get(id);
    }

    public List<String> getAllVisitLogs() {
        return new ArrayList<>(visitLogs.values());
    }

    public void deleteVisitLog(Long id) {
        if (!visitLogs.containsKey(id)) throw new ResourceNotFoundException("Visit log not found: " + id);
        visitLogs.remove(id);
    }
}
