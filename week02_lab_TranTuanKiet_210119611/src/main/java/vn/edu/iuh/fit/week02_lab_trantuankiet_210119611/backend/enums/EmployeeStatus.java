package vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.enums;

import lombok.Getter;

@Getter
public enum EmployeeStatus {
    TERMINATED(-1),
    ACTIVE(1),
    IN_ACTIVE(0);

    private int value;

    private EmployeeStatus(int value) {
        this.value = value;
    }

    public static EmployeeStatus fromValue(int status) {
        for (EmployeeStatus employeeStatus : EmployeeStatus.values()) {
            if (employeeStatus.value == status) {
                return employeeStatus;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}

