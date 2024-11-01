package vn.edu.iuh.fit.week03_lab_trantuankiet_21011961.backend.mapper;

import org.mapstruct.*;
import vn.edu.iuh.fit.week03_lab_trantuankiet_21011961.backend.dtos.ProductPriceDto;
import vn.edu.iuh.fit.week03_lab_trantuankiet_21011961.backend.entities.ProductPrice;

@Mapper
public interface ProductPriceMapper {
    @Mappings(
            {
                    @Mapping(target = "id.productId", source = "productId"),
                    @Mapping(target = "id.priceDateTime", source = "priceDateTime"),
            }
    )
    ProductPrice toEntity(ProductPriceDto productPriceDto);

    @Mappings(
            {
                    @Mapping(target = "productId", source = "id.productId"),
                    @Mapping(target = "priceDateTime", source = "id.priceDateTime"),
            }
    )
    ProductPriceDto toDto(ProductPrice productPrice);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    ProductPrice partialUpdate(ProductPriceDto productPriceDto, @MappingTarget ProductPrice productPrice);
}