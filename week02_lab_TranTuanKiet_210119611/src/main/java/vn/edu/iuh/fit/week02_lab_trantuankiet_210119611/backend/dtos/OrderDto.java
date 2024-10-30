package vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.dtos;

import lombok.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * DTO for {@link vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.models.Order}
 */
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class OrderDto implements Serializable {
    private Long id;
    private LocalDateTime orderDate;
    private CustomerDto customer;
    private EmployeeDto employee;
    private List<OrderDetailDto> orderDetails;



    public Double getTotalPrice() {
        return orderDetails.stream().mapToDouble(
                detail -> detail.getPrice() * detail.getQuantity()
        ).sum();
    }

    public Integer getTotal() {
        return orderDetails.size();
    }
}