package com.example.demo.service;

import com.example.demo.model.Visitor;
import java.util.List;

public interface VisitorService {
    Visitor getVisitorById(Long id);
    List<Visitor> getAllVisitors();
}
