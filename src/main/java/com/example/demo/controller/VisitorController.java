package com.example.demo.controller;

import com.example.demo.entity.Visitor;
import com.example.demo.repository.VisitorRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/visitors")
public class VisitorController {

    private final VisitorRepository visitorRepository;

    public VisitorController(VisitorRepository visitorRepository) {
        this.visitorRepository = visitorRepository;
    }

    @GetMapping
    public List<Visitor> getAllVisitors() {
        return visitorRepository.findAll();
    }

    @PostMapping
    public Visitor addVisitor(@RequestBody Visitor visitor) {
        return visitorRepository.save(visitor);
    }
}
