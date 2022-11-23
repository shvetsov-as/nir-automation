package com.niimto.automation.entity.classifier.document;

public enum EmployeeDocType {

    ARTICLE("Статья"),
    REPORT("Доклад"),
    MONOGRAPH("Монография"),
    CONFERENCE_MATERIALS("Сборник материалов конференции"),
    DISSERTATION("Диссертация"),
    REVIEW("Отзыв"),
    CONCLUSION("Заключение"),
    MODEL("Модель"),
    EXAMINATION("Экспертиза"),
    INVENTION("Изобретение"),
    PATENT("Патент"),
    TRAINING("Учения"),
    OPERATIONAL_TASK("Оперативное задание"),
    COMBAT_TRAINING_EVENT("Мероприятие боевой подготовки"),
    MILITARY_THEORETICAL_WORK("Военно-теоретический труд"),
    PROGRAM("Программа"),
    CONFERENCE("Конференция"),
    INTERDEPARTMENTAL_COMMISSION("Межведомственная комиссия"),
    INTERNATIONAL_CONFERENCE("Международная конференция"),
    RATIONALIZATION_PROPOSAL("Техник"),
    EXHIBITION("Выставка"),
    COMPETITION("Конкурс");

    private final String type;

    EmployeeDocType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getShortName() {
        return "Российское сокращение";
    }
}
