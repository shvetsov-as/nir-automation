package com.niimto.automation.entity.classifier.security;

public enum UserStatus {
    ACTIVE("Активна"),
    INACTIVE("Неактивна"),
    ARCHIVE("В архиве");

    private final String status;

    UserStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
