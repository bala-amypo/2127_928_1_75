package com.example.demo.repository;

import com.example.demo.entity.VisitorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitorRepository extends JpaRepository<VisitorEntity, Long> {
}
