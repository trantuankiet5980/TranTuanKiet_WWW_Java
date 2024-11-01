package vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.fontend.models;

import lombok.*;
import vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.dtos.ProductDto;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class CartDetail {
    ProductDto productDto;
    String note;
    Double price;
    Long quantity;
}
