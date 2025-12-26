package com.example.demo.service.impl;

import com.example.demo.model.Visitor;
import com.example.demo.service.VisitorService;
import org.springframework.stereotype.Service;

@Service
public class VisitorServiceImpl implements VisitorService {

    @Override
    public Visitor addVisitor(String name, String phone) {
        Visitor v = new Visitor();
        v.setName(name);
        v.setPhone(phone);
        return v;
    }
}
