package com.example.demo.service;

import com.example.demo.model.RiskRuleModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RiskRuleService {

    private final List<RiskRuleModel> rules = new ArrayList<>();

    public RiskRuleModel create(RiskRuleModel rule) {
        rules.add(rule);
        return rule;
    }

    public List<RiskRuleModel> getAll() {
        return rules;
    }
}
