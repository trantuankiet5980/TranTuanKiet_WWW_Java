package vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.dtos;

import lombok.*;

import java.io.Serializable;

/**
 * DTO for {@link vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.models.OrderDetail}
 */
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class OrderDetailDto implements Serializable {
    Long orderId;
    Long productId;
    ProductDto product;
    String note;
    Double price;
    Double quantity;
}