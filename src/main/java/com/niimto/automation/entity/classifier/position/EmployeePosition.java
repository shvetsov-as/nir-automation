package com.niimto.automation.entity.classifier.position;

public enum EmployeePosition {

    HEAD_OF_DEPARTMENT("Начальник управления"),
    DEPUTY_HEAD_OF_DEPARTMENT("Заместитель начальника управления"),
    HEAD("Начальник"),
    DEPUTY_HEAD("Заместитель начальника"),
    LEADING_RESEARCHER("Ведущий научный сотрудник"),
    SENIOR_RESEARCHER("Старший научный сотрудник"),
    MIDDLE_RESEARCHER("Научный сотрудник"),
    JUNIOR_RESEARCHER("Младший научный сотрудник"),
    LEADING_ENGINEER("Ведущий инженер"),
    ENGINEER_PROGRAMMER("Инженер - программист"),
    ENGINEER("Инженер"),
    TECHNICIAN("Техник"),
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
