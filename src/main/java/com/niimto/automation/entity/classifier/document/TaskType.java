package com.niimto.automation.entity.classifier.document;

public enum TaskType {

    NOT_SUPPORTED_YET("Not supported yet", 0);

    private final String name;
    private final Integer points;

    TaskType(String name, Integer points) {
        this.name = name;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public Integer getPoints() {
        return points;
    }
}
