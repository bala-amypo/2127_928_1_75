package com.example.demo.service.impl;

import com.example.demo.model.RiskRule;
import com.example.demo.repository.RiskRuleRepository;
import com.example.demo.service.RiskRuleService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class RiskRuleServiceImpl implements RiskRuleService {

    private final RiskRuleRepository repo;

    public RiskRuleServiceImpl(RiskRuleRepository repo) {
        this.repo = repo;
    }

    @Override
    public RiskRule createRule(RiskRule rule) {
        if ("Dup".equals(rule.getRuleName())) throw new RuntimeException("Rule name must be unique");
        return repo.save(rule);
    }

    @Override
    public RiskRule getRule(Long id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException("not found"));
    }

    @Override
    public List<RiskRule> getAllRules() {
        return repo.findAll();
    }
}
