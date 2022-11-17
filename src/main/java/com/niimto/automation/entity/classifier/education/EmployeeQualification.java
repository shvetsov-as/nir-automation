package com.niimto.automation.entity.classifier.education;

public enum EmployeeQualification {
    BACHELOR("Бакалавр"),
    SPECIALIST("Специалист"),
    MASTER("Магистр");

    private final String qualification;

    EmployeeQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getQualification() {
        return qualification;
    }

    public String getShortName() {
        return "Российское сокращение";
    }
}
