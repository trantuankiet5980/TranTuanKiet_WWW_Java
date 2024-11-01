package vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.fontend.models;

import lombok.*;
import vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.dtos.CustomerDto;
import vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.dtos.EmployeeDto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Cart implements Serializable {
    private LocalDateTime orderDate;
    private CustomerDto customerDto;
    private EmployeeDto employeeDto;
    private List<CartDetail> cartDetails;
    public Integer getTotal() {
        return cartDetails.size();
    }
    public Double getTotalPrice() {
        return cartDetails.stream().mapToDouble(
                cartDetail -> cartDetail.getPrice() * cartDetail.getQuantity()
        ).sum();
    }
}
