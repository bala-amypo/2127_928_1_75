package com.example.demo.repository;

import com.example.demo.entity.RiskScoreEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RiskScoreRepository extends JpaRepository<RiskScoreEntity, Long> {

    Optional<RiskScoreEntity> findByVisitId(Long visitId);
}
