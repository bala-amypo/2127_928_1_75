package com.example.demo.util;

public class RiskLevelUtils {

    private RiskLevelUtils() {}

    public static String getRiskLevel(int score) {
        if (score >= 80) return "CRITICAL";
        if (score >= 60) return "HIGH";
        if (score >= 30) return "MEDIUM";
        return "LOW";
    }
}
