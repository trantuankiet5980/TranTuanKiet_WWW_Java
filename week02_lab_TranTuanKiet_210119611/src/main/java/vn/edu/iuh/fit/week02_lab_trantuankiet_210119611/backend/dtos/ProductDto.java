package vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.dtos;

import lombok.*;
import vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.enums.ProductStatus;

import java.io.Serializable;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * DTO for {@link vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.models.Product}
 */
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class ProductDto implements Serializable {
    private Long id;
    private String description;
    private String manufacturer;
    private String name;
    private ProductStatus status;
    private String unit;
    private List<ProductImageDto> productImages;
    private List<ProductPriceDto> productPrices;

    public double getPrice() {
        return productPrices.get(0).getPrice();
    }
    public double getPriceLatest() {
        return productPrices
                .stream()
                .sorted(
                Comparator.comparing(ProductPriceDto::getPriceDateTime).reversed()
        ).collect(Collectors.toList()).get(0).getPrice();
    }
}