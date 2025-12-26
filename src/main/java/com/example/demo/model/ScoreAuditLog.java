package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "score_audit_log")
public class ScoreAuditLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 🔹 reference to score
    @Column(name = "score_id")
    private Long scoreId;

    // 🔹 reference to user
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "action")
    private String action;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    // ---------- getters & setters ----------

    public Long getId() {
        return id;
    }

    public Long getScoreId() {
        return scoreId;
    }

    public void setScoreId(Long scoreId) {
        this.scoreId = scoreId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
