package vn.edu.iuh.fit.week03_lab_trantuankiet_21011961.backend.dtos;

import lombok.*;

import java.io.Serializable;

/**
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
    private String unit;
    private String imgPath;
    private Double price;
}