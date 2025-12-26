package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import com.example.demo.model.RiskRuleModel;
import com.example.demo.service.RiskRuleService;

@RestController
@RequestMapping("/api/risk-rules")
public class RiskRuleController {

    private final RiskRuleService riskRuleService;

    public RiskRuleController(RiskRuleService riskRuleService) {
        this.riskRuleService = riskRuleService;
    }

    @PostMapping
    public RiskRuleModel createRule(@RequestBody RiskRuleModel rule) {
        return riskRuleService.createRule(rule);
    }
}
