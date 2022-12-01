package com.niimto.automation.entity.classifier.position;

public enum EmployeeDepartment {

    HEAD_DEPARTMENT_3("3 управление научно-исследовательское") {
        @Override
        public String getShortName() {
            return "3 УНИ";
        }
    },
    DEPARTMENT_31("31 отдел научно-исследовательский " +
            "(исследований проблем строительства и развития компонентов АСУ МТО ВС РФ)") {
        @Override
        public String getShortName() {
            return "31 ОНИ";
        }
    },
    DEPARTMENT_32("32 отдел научно-исследовательский" +
            " (исследования проблем создания и развития информационного обеспечения)") {
        @Override
        public String getShortName() {
            return "32 ОНИ";
        }
    },
    LABORATORY("научно-исследовательская лаборатория (моделирования процессов МТО войск (сил))") {
        @Override
        public String getShortName() {
            return "НИЛ";
        }
    };

    private final String department;

    EmployeeDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public String getShortName() {
        return "Российское сокращение";
    }
}

