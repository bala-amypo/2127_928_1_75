package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "visit_log")
public class VisitLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 🔹 reference to user
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "page")
    private String page;

    @Column(name = "visited_at")
    private LocalDateTime visitedAt;

    // ---------- getters & setters ----------

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public LocalDateTime getVisitedAt() {
        return visitedAt;
    }

    public void setVisitedAt(LocalDateTime visitedAt) {
        this.visitedAt = visitedAt;
    }
}
