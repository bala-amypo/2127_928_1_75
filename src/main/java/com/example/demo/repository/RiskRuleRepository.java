package com.example.demo.repository;

import com.example.demo.model.RiskRuleModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RiskRuleRepository {

    private final List<RiskRuleModel> rules = new ArrayList<>();

    public RiskRuleModel save(RiskRuleModel rule) {
        rules.add(rule);
        return rule;
    }

    public List<RiskRuleModel> findAll() {
        return rules;
    }
}
