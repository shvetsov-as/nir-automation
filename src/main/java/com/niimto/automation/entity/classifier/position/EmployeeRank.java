package com.niimto.automation.entity.classifier.position;

public enum EmployeeRank {

    CIVILIAN("Гражданский персонал"),
    PRIVATE("Рядовой"),
    PRIVATE_FC("Ефрейтор"),
    LANCE_SERGEANT("Младший сержант"),
    SERGEANT("Сержант"),
    STAFF_SERGEANT("Старший сержант"),
    MASTER_SERGEANT("Старшина"),
    WARRANT_OFFICER("Прапорщик"),
    SENIOR_WARRANT_OFFICER("Старший прапорщик"),
    FIRST_LIEUTENANT("Лейтенант"),
    SECOND_LIEUTENANT("Старший лейтенант"),
    CAPTAIN("Капитан"),
    MAJOR("Майор"),
    LIEUTENANT_COLONEL("Подполковник"),
    COLONEL("Полковник");

    private final String rank;

    EmployeeRank(String rank) {
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }

    public String getShortName() {
        return "Российское сокращение";
    }
}
