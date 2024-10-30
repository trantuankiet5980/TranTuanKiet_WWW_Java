package vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.enums;

import lombok.Getter;

@Getter
public enum ProductStatus {
    TERMINATED(-1),
    ACTIVE(1),
    IN_ACTIVE(0);

    private int value;

    ProductStatus(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}