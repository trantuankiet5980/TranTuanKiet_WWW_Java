package vn.edu.iuh.fit.backend.enums;

import lombok.ToString;

public enum SkillLevel {
    BEGINNER("BEGINNER"),
    INTERMEDIATE("INTERMEDIATE"),
    ADVANCED("ADVANCED"),
    PROFESSIONAL("PROFESSIONAL"),
    MASTER("MASTER");

    private String name;

    SkillLevel(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
