package vn.edu.iuh.fit.week03_lab_trantuankiet_21011961.backend.dtos;

import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class ProductPriceDto implements Serializable {
    private Long productId;
    private LocalDateTime priceDateTime;
    private String note;
    private Double value;
    private Timestamp applyDate;
    private Integer status;
}