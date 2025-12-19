package com.example.demo.repository;

import com.example.demo.entity.RiskRuleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RiskRuleRepository extends JpaRepository<RiskRuleEntity, Long> {

    boolean existsByRuleName(String ruleName);
}
