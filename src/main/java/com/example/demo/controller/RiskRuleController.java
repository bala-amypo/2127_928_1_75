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

    @GetMapping("/active")
    public List<RiskRuleEntity> getActiveRules() {
        return riskRuleService.getActiveRules();
    }
}
