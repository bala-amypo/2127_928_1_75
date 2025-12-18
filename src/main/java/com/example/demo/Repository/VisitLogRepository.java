package com.example.demo.repository;

import com.example.demo.entity.VisitLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VisitLogRepository extends JpaRepository<VisitLogEntity, Long> {

    List<VisitLogEntity> findByVisitorId(Long visitorId);
}
