package com.niimto.automation.entity.classifier.education;

public enum EmployeeTitle {

    DOCENT("Доцент"),
    PROFESSOR("Профессор"),
    SENIOR_RESEARCHER("Старший научный сотрудник"){
        @Override
        public String getShortName() {
            return "снс";
        }
    };

    private final String title;

    EmployeeTitle(String title) {
        this.title = title;
    }

    public String getAcademicTitle() {
        return title;
    }

    public String getShortName() {
        return "Российское сокращение";
    }
}
