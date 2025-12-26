package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.VisitorModel;

public interface VisitorRepository extends JpaRepository<VisitorModel, Long> {
}
