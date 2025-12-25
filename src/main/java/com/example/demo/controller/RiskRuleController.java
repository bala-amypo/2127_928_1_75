package com.example.demo.controller;

import com.example.demo.model.RiskRuleModel;
import com.example.demo.service.RiskRuleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/risk-rules")
public class RiskRuleController {

    private final RiskRuleService service;

    public RiskRuleController(RiskRuleService service) {
        this.service = service;
    }

    @PostMapping
    public RiskRuleModel create(@RequestBody RiskRuleModel model) {
        return service.create(model);
    }

    @GetMapping
    public List<RiskRuleModel> getAll() {
        return service.getAll();
    }
}
