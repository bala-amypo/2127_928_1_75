package com.example.demo.repository;

import com.example.demo.entity.RiskScoreEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RiskScoreRepository
        extends JpaRepository<RiskScoreEntity, Long> {

    List<RiskScoreEntity> findByVisitorId(Long visitorId);
}
