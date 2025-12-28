package com.example.demo.service;

import com.example.demo.model.Visitor;

public interface VisitorService {
    Visitor createVisitor(Visitor visitor);
    Visitor getVisitor(Long id);
}
