package com.example.demo.util;

public final class RiskLevelUtils {

    private RiskLevelUtils() {
    }

    public static String getRiskLevel(int score) {
        if (score >= 70) {
            return "HIGH";
        }
        if (score >= 40) {
            return "MEDIUM";
        }
        return "LOW";
    }
}
