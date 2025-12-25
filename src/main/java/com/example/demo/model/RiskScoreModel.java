package com.example.demo.model;

public class RiskScoreModel {
    private Long id;
    private Long visitLogId;
    private int score;

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getVisitLogId() { return visitLogId; }
    public void setVisitLogId(Long visitLogId) { this.visitLogId = visitLogId; }

    public int getScore() { return score; }
    public void setScore(int score) { this.score = score; }
}
