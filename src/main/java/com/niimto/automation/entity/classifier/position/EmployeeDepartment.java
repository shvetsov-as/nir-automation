package com.niimto.automation.entity.classifier.position;

import java.util.Set;

public enum EmployeeDepartment {

    HEAD_OF_INSTITUTE(Set.of(EmployeeBranch.BRANCH_11, EmployeeBranch.BRANCH_12), "Управление научно-исследовательского института (ВСИ МТО ВС РФ)") {
        @Override
        public String getShortName() {
            return "Управление НИИ";
        }
    },

    DEPARTMENT_ORG_PLAN(Set.of(EmployeeBranch.BRANCH_11),"Отдел (организации и планирования научно-исследовательских работ)"){
        @Override
        public String getShortName() {
            return "ОПНИР";
        }
    },

    DEPARTMENT_MIL_TECH_INFO(Set.of(EmployeeBranch.BRANCH_11),"Отдел (военно-технической информации)"){
        @Override
        public String getShortName() {
            return "ОВТИ";
        }
    },

    DEPARTMENT_LAB_EXP_BASE(Set.of(EmployeeBranch.BRANCH_11),"Отделение (обеспечения лабораторно-экспериментальной базы)"){
        @Override
        public String getShortName() {
            return "Отделение ОЛЭБ";
        }
    },

    DEPARTMENT_LIB(Set.of(EmployeeBranch.BRANCH_11),"Библиотека (научно-технической информации)"){
        @Override
        public String getShortName() {
            return "Библиотека НТИ";
        }
    },

    DEPARTMENT_1(Set.of(EmployeeBranch.BRANCH_11),"1 управление научно-исследовательское (организации МТО)"){
        @Override
        public String getShortName() {
            return "1 УНИ";
        }
    },

    DEPARTMENT_2(Set.of(EmployeeBranch.BRANCH_11),"2 управление научно-исследовательское (материального, транспортного и технического обеспечения)"){
        @Override
        public String getShortName() {
            return "2 УНИ";
        }
    },

    DEPARTMENT_3(Set.of(EmployeeBranch.BRANCH_11),"3 управление научно-исследовательское (автоматизации систем МТО)"){
        @Override
        public String getShortName() {
            return "3 УНИ";
        }
    },
    DEPARTMENT_RES_LAB(Set.of(EmployeeBranch.BRANCH_11),"Научно-исследовательская лаборатория (стандартизации и каталогизации)") {
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

