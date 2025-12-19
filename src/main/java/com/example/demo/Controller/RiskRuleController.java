package com.example.demo.controller;

import com.example.demo.entity.RiskRuleEntity;
import com.example.demo.service.RiskRuleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/risk-rules")
public class RiskRuleController {

    private final RiskRuleService riskRuleService;

    public RiskRuleController(RiskRuleService riskRuleService) {
        this.riskRuleService = riskRuleService;
    }

    @PostMapping
    public RiskRuleEntity createRule(@RequestBody RiskRuleEntity rule) {
        return riskRuleService.createRule(rule);
    }

    @GetMapping
    public List<RiskRuleEntity> getAllRules() {
        return riskRuleService.getAllRules();
    }

    @GetMapping("/{id}")
    public RiskRuleEntity getRuleById(@PathVariable Long id) {
        return riskRuleService.getRuleById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteRule(@PathVariable Long id) {
        riskRuleService.deleteRule(id);
    }
}
