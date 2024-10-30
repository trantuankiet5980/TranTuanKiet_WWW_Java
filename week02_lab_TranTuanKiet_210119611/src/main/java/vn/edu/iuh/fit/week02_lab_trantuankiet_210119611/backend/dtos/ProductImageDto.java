package vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.dtos;

import lombok.*;
import java.io.Serializable;

/**
 * DTO for {@link vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.models.ProductImage}
 */
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class ProductImageDto implements Serializable {
    private Long id;
    private String alternative;
    private String path;
    private Long productId;
}