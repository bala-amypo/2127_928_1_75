package com.example.demo.controller;

import com.example.demo.service.RiskRuleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/risk-rules")
public class RiskRuleController {

    private final RiskRuleService riskRuleService;

    public RiskRuleController(RiskRuleService riskRuleService) {
        this.riskRuleService = riskRuleService;
    }

    @GetMapping("/{visitorId}")
    public ResponseEntity<String> getRiskLevel(@PathVariable Long visitorId) {
        String level = riskRuleService.calculateRiskLevel(visitorId);
        return ResponseEntity.ok(level);
    }
}
