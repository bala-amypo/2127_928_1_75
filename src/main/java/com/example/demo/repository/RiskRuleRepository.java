package com.example.demo.repository;

import com.example.demo.entity.RiskRuleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RiskRuleRepository extends JpaRepository<RiskRuleEntity, Long> {

    List<RiskRuleEntity> findByActiveTrue();

    List<RiskRuleEntity> findByRuleTypeAndActiveTrue(String ruleType);
}
