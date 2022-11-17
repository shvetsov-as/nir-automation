package com.niimto.automation.entity.classifier.absence;

public enum EmployeeStatus {

    ON_DUTY("В наряде") {
        @Override
        public String getShortName() {
            return "н";
        }
    },
    ON_STUDY("На учебе") {
        @Override
        public String getShortName() {
            return "у";
        }
    },
    ON_SICK("На больничном") {
        @Override
        public String getShortName() {
            return "б";
        }
    },
    ON_VOCATION("В отпуске") {
        @Override
        public String getShortName() {
            return "о";
        }
    },
    DISMISSED("В увольнении") {
        @Override
        public String getShortName() {
            return "ув";
        }
    },
    ON_MISSION("В командировке") {
        @Override
        public String getShortName() {
            return "к";
        }
    },
    IN_HOSPITAL("В госпитале") {
        @Override
        public String getShortName() {
            return "г";
        }
    },
    IN_SERVICE("Налицо") {
        @Override
        public String getShortName() {
            return "нл";
        }
    };

    private final String status;

    EmployeeStatus(String status) {
        this.status = status;
    }

    public String getAbsenceStatus() {
        return status;
    }

    public String getShortName() {
        return "Российское сокращение";
    }
}
