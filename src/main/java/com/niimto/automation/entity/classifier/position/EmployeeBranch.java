package com.niimto.automation.entity.classifier.position;

public enum EmployeeBranch {

    BRANCH_11("11 отдел научно-исследовательский (исследований проблем строительства и " +
            "развития системы МТО ВС РФ, организации применения сил и средств МТО в операциях (боевых действиях))") {
        @Override
        public String getShortName() {
            return "11 ОНИ";
        }
    },

    BRANCH_12("12 отдел научно-исследовательский (исследований проблем" +
            " коммунально-эксплуатационного обеспечения, экологической и пожарной безопасности)") {
        @Override
        public String getShortName() {
            return "12 ОНИ";
        }
    },

    BRANCH_13("13 отдел научно-исследовательский(исследований проблем совершенствования видов МТО)") {
        @Override
        public String getShortName() {
            return "13 ОНИ";
        }
    },

    BRANCH_14("14 отдел научно-исследовательский (исследований проблем" +
            " военно-экономической эффективности, анализа и обобщения опыта МТО)") {
        @Override
        public String getShortName() {
            return "14 ОНИ";
        }
    },

    BRANCH_15("15 отдел научно-исследовательский (исследований проблем" +
            " совершенствования подготовки соединений, частей, подразделений и специалистов МТО)") {
        @Override
        public String getShortName() {
            return "15 ОНИ";
        }
    },

    BRANCH_LAB1_OPERATION("НИЛ (исследований проблем оперативной, боевой" +
            " и мобилизационной подготовки СЧО МТО ВСРФ)") {
        @Override
        public String getShortName() {
            return "НИЛ оперативной подготовки";
        }
    },

    BRANCH_LAB1_GRADUATION("НИЛ (исследований проблем совершенствования образовательной и методической деятельности)") {
        @Override
        public String getShortName() {
            return "НИЛ образовательной деятельности";
        }
    },

    BRANCH_16("16 отдел научно-испытательный (пос. Приветнинское, Выборгский район, Ленинградская область)") {
        @Override
        public String getShortName() {
            return "16 ОНИ";
        }
    },

    BRANCH_21("21 отдел научно исследовательский (исследований проблем материального обеспечения войск (сил))") {
        @Override
        public String getShortName() {
            return "21 ОНИ";
        }
    },

    BRANCH_22("22 отдел научно-исследовательский (исследований проблем транспортного обеспечения войск (сил))") {
        @Override
        public String getShortName() {
            return "22 ОНИ";
        }
    },

    BRANCH_23("23 отдел научно-исследовательский (исследований проблем технического обеспечения войск (сил))") {
        @Override
        public String getShortName() {
            return "23 ОНИ";
        }
    },

    BRANCH_24("24отдел научно-исследовательский (исследований проблем развития технической оснащенности системы МТО)") {
        @Override
        public String getShortName() {
            return "24 ОНИ";
        }
    },

    BRANCH_25("25 отдел научно-исследовательский (исследований проблем применения Железнодорожных войск)") {
        @Override
        public String getShortName() {
            return "25 ОНИ";
        }
    },

    BRANCH_31("31 отдел научно-исследовательский (исследования проблем строительства" +
            " и развития компонентов АСУ МТО ВС РФ)") {
        @Override
        public String getShortName() {
            return "31 ОНИ";
        }
    },

    BRANCH_32("32 отдел научно-исследовательский (исследования проблем " +
            "создания и развития информационного обеспечения)") {
        @Override
        public String getShortName() {
            return "32 ОНИ";
        }
    },

    BRANCH_LAB3_MODELING("Научно-исследовательская лаборатория (моделирования процессов МТО войск (сил))") {
        @Override
        public String getShortName() {
            return "НИЛ моделирования процессов";
        }
    };

    private final String branch;

    EmployeeBranch(String branch) {
        this.branch = branch;
    }

    public String getBranch() {
        return branch;
    }

    public String getShortName() {
        return "Российское сокращение";
    }
}
