package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "risk_scores")
public class RiskScoreModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private Integer score;

    public RiskScoreModel() {}

    public Long getId() {
        return id;
    }

    public Long getUserId() {
        return userId;
    }

    public Integer getScore() {
        return score;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
