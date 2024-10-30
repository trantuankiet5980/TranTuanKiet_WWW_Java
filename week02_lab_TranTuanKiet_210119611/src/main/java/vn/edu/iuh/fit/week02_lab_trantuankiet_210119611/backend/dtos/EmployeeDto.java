package vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.dtos;

import lombok.*;
import vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.enums.EmployeeStatus;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DTO for {@link vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.models.Employee}
 */
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class EmployeeDto implements Serializable {
    Long id;
    String address;
    LocalDateTime dob;
    String email;
    String fullName;
    String phone;
    EmployeeStatus status;
}