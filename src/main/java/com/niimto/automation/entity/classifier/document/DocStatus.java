package com.niimto.automation.entity.classifier.document;

public enum DocStatus {

    IN_PROGRESS("Выполняется"),
    DONE("Выполнен"),
    BACKLOG("План"),
    UNKNOWN("Не определен");

    private final String status;

    DocStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public String getShortName() {
        return "Российское сокращение";
    }
}
