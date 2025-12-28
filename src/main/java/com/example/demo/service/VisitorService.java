package com.example.demo.service;

import com.example.demo.model.Visitor;
import java.util.List;

public interface VisitorService {
    List<Visitor> getAllVisitors();
    Visitor createVisitor(Visitor visitor);
}
