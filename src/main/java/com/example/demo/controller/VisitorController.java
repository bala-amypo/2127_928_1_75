package com.example.demo.controller;

import com.example.demo.model.VisitorModel;
import com.example.demo.service.VisitorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/visitors")
public class VisitorController {

    private final VisitorService service;

    public VisitorController(VisitorService service) {
        this.service = service;
    }

    @PostMapping
    public VisitorModel create(@RequestBody VisitorModel visitor) {
        return service.create(visitor);
    }

    @GetMapping
    public List<VisitorModel> getAll() {
        return service.getAll();
    }
}
