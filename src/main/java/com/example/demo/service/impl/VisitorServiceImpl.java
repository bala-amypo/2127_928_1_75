package com.example.demo.service.impl;

import com.example.demo.model.Visitor;
import com.example.demo.service.VisitorService;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class VisitorServiceImpl implements VisitorService {

    @Override
    public Visitor getVisitorById(Long id) {
        return new Visitor(id, "Test Visitor", "test@example.com");
    }

    @Override
    public List<Visitor> getAllVisitors() {
        List<Visitor> list = new ArrayList<>();
        list.add(new Visitor(1L, "Visitor1", "v1@example.com"));
        return list;
    }
}
