package com.example.demo.repository;

import com.example.demo.entity.VisitLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface VisitLogRepository extends JpaRepository<VisitLogEntity, Long> {
    
    List<VisitLogEntity> findByVisitorId(Long visitorId);
    
    Optional<VisitLogEntity> findById(Long id);
}
