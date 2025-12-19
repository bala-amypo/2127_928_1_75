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

    @GetMapping("/{key}")
    public ResponseEntity<String> getRiskLevel(@PathVariable String key) {
        return ResponseEntity.ok(riskRuleService.getRiskLevel(key));
    }

    @PostMapping
    public ResponseEntity<Void> addOrUpdateRule(@RequestParam String key, @RequestParam String level) {
        riskRuleService.saveOrUpdateRule(key, level);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{key}")
    public ResponseEntity<Void> deleteRule(@PathVariable String key) {
        riskRuleService.deleteRule(key);
        return ResponseEntity.ok().build();
    }
}
