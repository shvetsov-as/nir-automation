package com.niimto.automation.entity.classifier.position;

public enum EmployeePosition {

    HEAD("Начальник"),

    DEPUTY_HEAD("Заместитель начальника"),

    DEPUTY_SCIENTIFIC("Заместитель начальника по научной работе"),

    HEAD_OF_DEPARTMENT("Начальник управления"),

    HEAD_OF_BRANCH("Начальник отдела"),

    DEPUTY_HEAD_OF_BRANCH("Заместитель начальника отдела"),

    HEAD_OF_SUBBRANCH("Начальник отделения"),

    HEAD_OF_LAB("Начальник лаборатории"),

    DEPUTY_HEAD_OF_SUBBRANCH("Заместитель начальника отделения"),

    MANAGER_OF_LIB("Заведующий библиотекой"),

    MANAGER_OF_LAB("Заведующий лабораторией"),

    HEAD_RESEARCHER("Главный научный сотрудник"),

    LEADING_RESEARCHER("Ведущий научный сотрудник"),

    LEADING_DOCUMENT_SPECIALIST("Ведущий документовед"),

    SENIOR_RESEARCHER("Старший научный сотрудник"),

    SENIOR_ASSISTANT("Старший помощник начальника отдела"),

    MIDDLE_RESEARCHER("Научный сотрудник"),

    JUNIOR_RESEARCHER("Младший научный сотрудник"),

    LEADING_ENGINEER("Ведущий инженер"),

    ENGINEER("Инженер"),

    LEADING_ENGINEER_PROGRAMMER("Ведущий инженер - программист"),

    ENGINEER_PROGRAMMER("Инженер - программист"),

    TECHNICIAN("Техник"),

    LOCKSMITH_PLUMBER("Слесарь - сантехник"),

    LOCKSMITH_MEASURE_DEVICES("Слесарь КИП и А"),

    LOCKSMITH_EMERGENCY("Слесарь АВР"),

    LOCKSMITH_ELECTRICIAN("Слесарь - электромонтажник"),

    ASSISTANT("Помощник начальника отдела"),

    LIBRARIAN("Библиотекарь"),

    DOCUMENT_SPECIALIST("Документовед"),

    TECHNICAL_TRANSLATOR("Переводчик технической литературы"),

    COMPUTER_OPERATOR("Оператор ЭВМ");

    private final String position;

    EmployeePosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public String getShortName() {
        return "Российское сокращение";
    }
}