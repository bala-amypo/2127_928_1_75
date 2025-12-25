package com.example.demo.repository;

import com.example.demo.model.VisitorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitorRepository extends JpaRepository<VisitorModel, Long> {
}
