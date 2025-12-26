package com.example.demo.repository;

import com.example.demo.model.VisitLog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface VisitLogRepository extends JpaRepository<VisitLog, Long> {

    List<VisitLog> findByVisitorSince(Long visitorId, LocalDateTime since);

    Long countVisitsInWindow(Long visitorId, LocalDateTime from, LocalDateTime to);
}
