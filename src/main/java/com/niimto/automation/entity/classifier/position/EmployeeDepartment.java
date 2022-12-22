package com.niimto.automation.entity.classifier.position;

import java.util.Set;

public enum EmployeeDepartment {

    HEAD_OF_INSTITUTE(Set.of(), "Управление научно-исследовательского института (ВСИ МТО ВС РФ)") {
        @Override
        public String getShortName() {
            return "Управление НИИ";
        }
    },

    DEPARTMENT_ORG_PLAN(Set.of(), "Отдел (организации и планирования научно-исследовательских работ)") {
        @Override
        public String getShortName() {
            return "ОПНИР";
        }
    },

    DEPARTMENT_MIL_TECH_INFO(Set.of(), "Отдел (военно-технической информации)") {
        @Override
        public String getShortName() {
            return "ОВТИ";
        }
    },

    DEPARTMENT_LAB_EXP_BASE(Set.of(), "Отделение (обеспечения лабораторно-экспериментальной базы)") {
        @Override
        public String getShortName() {
            return "Отделение ОЛЭБ";
        }
    },

    DEPARTMENT_LIB(Set.of(), "Библиотека (научно-технической информации)") {
        @Override
        public String getShortName() {
            return "Библиотека НТИ";
        }
    },

    DEPARTMENT_1(
            Set.of(
                    EmployeeBranch.BRANCH_11,
                    EmployeeBranch.BRANCH_12,
                    EmployeeBranch.BRANCH_13,
                    EmployeeBranch.BRANCH_14,
                    EmployeeBranch.BRANCH_15,
                    EmployeeBranch.BRANCH_LAB1_OPERATION,
                    EmployeeBranch.BRANCH_LAB1_GRADUATION,
                    EmployeeBranch.BRANCH_16
            ), "1 управление научно-исследовательское (организации МТО)") {
        @Override
        public String getShortName() {
            return "1 УНИ";
        }
    },

    DEPARTMENT_2(
            Set.of(
                    EmployeeBranch.BRANCH_21,
                    EmployeeBranch.BRANCH_22,
                    EmployeeBranch.BRANCH_23,
                    EmployeeBranch.BRANCH_24,
                    EmployeeBranch.BRANCH_25
            ), "2 управление научно-исследовательское (материального, транспортного и технического обеспечения)") {
        @Override
        public String getShortName() {
            return "2 УНИ";
        }
    },

    DEPARTMENT_3(
            Set.of(
                    EmployeeBranch.BRANCH_31,
                    EmployeeBranch.BRANCH_32,
                    EmployeeBranch.BRANCH_LAB3_MODELING
            ), "3 управление научно-исследовательское (автоматизации систем МТО)") {
        @Override
        public String getShortName() {
            return "3 УНИ";
        }
    },
    DEPARTMENT_RES_LAB(Set.of(), "Научно-исследовательская лаборатория (стандартизации и каталогизации)") {
        @Override
        public String getShortName() {
            return "НИЛ (СиК)";
        }
    };

    private final String department;
    private final Set<EmployeeBranch> branch;

    EmployeeDepartment(Set<EmployeeBranch> branch, String department) {
        this.branch = branch;
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public Set<EmployeeBranch> getBranch() {
        return branch;
    }

    public String getShortName() {
        return "Российское сокращение";
    }
}

