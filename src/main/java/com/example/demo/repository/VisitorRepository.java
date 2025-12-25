package com.example.demo.repository;

import com.example.demo.entity.VisitorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VisitorRepository extends JpaRepository<VisitorEntity, Long> {

    Optional<VisitorEntity> findByPhone(String phone);

    Optional<VisitorEntity> findByEmail(String email);
}
