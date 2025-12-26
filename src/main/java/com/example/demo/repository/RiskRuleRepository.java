package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.RiskRuleModel;

public interface RiskRuleRepository extends JpaRepository<RiskRuleModel, Long> {
}
