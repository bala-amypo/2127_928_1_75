package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "risk_scores")
public class RiskScoreEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "visitor_id")
    private Visitor visitor;

    private Integer score;
    private String level;

    // ===== GETTERS =====
    public Long getId() {
        return id;
    }

    public Visitor getVisitor() {
        return visitor;
    }

    public Integer getScore() {
        return score;
    }

    public String getLevel() {
        return level;
    }

    // ===== SETTERS =====
    public void setId(Long id) {
        this.id = id;
    }

    public void setVisitor(Visitor visitor) {
        this.visitor = visitor;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
