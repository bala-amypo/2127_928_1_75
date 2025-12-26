package com.example.demo.repository;

import com.example.demo.model.RiskScoreModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RiskScoreRepository extends JpaRepository<RiskScoreModel, Long> {
}
