package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "risk_scores")
public class RiskScoreModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long visitLogId;
    private int score;

    // getters & setters
}
