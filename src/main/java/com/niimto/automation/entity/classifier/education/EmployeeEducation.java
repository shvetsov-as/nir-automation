package com.niimto.automation.entity.classifier.education;

public enum EmployeeEducation {
    SECONDARY_GENERAL("Среднее общее образование"),
    SECONDARY_WORKER ("Среднее профессиональное образоване по программе подготовки квалифицированных рабочих (служащих)"),
    SECONDARY_SPECIALIST("Среднее профессиональное образование по программе подготовки специалистов среднего звена"),
    HIGHER_BACHELOR("Высшее образование - бакалавриат"),
    HIGHER_SPECIALIST("Высшее образование - специалитет"),
    HIGHER_MASTER("Высшее образование - магистратура");

    private final String education;

    EmployeeEducation(String education) {
        this.education = education;
    }

    public String getEducation() {
        return education;
    }

    public String getShortName() {
        return "Российское сокращение";
    }
}
