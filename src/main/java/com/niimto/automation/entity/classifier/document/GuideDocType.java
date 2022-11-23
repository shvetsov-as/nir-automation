package com.niimto.automation.entity.classifier.document;

public enum GuideDocType {

    GOST("ГОСТ"),
    ACADEMY_NORM("Норма ВА МТО"),
    METHODOLOGY("Методика"),
    BOOK("Книга"),
    MISC("Разное"),
    LEGISLATIVE_ACT_OF_RF("Законодательный акт Российской Федерации"),
    PLANNING("Планирование"),
    MATERIALS_OF_OTHER_ORG("Материалы других организаций");

    private final String type;

    GuideDocType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getShortName() {
        return "Российское сокращение";
    }
}
