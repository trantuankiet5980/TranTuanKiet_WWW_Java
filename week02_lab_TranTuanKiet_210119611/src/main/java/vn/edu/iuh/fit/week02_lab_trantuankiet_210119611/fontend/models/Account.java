package vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.fontend.models;

import lombok.*;
import vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.enums.EmployeeStatus;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Account {
    Long id;
    String address;
    LocalDateTime dob;
    String email;
    String fullName;
    String phone;
    EmployeeStatus status;
}
