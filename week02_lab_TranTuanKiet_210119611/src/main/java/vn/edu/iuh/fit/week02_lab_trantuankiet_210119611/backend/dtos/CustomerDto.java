package vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.dtos;

import lombok.*;

import java.io.Serializable;

/**
 * DTO for {@link CustomerDto}
 */
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Builder
public class CustomerDto implements Serializable {
    private Long id;
    private String address;
    private String name;
    private String email;
    private String phone;
}