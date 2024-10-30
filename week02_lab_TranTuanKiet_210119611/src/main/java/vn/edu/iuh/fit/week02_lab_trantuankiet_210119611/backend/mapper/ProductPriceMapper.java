package vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.dtos.ProductPriceDto;
import vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.models.ProductPrice;

@Mapper(uses = ProductMapper.class)
public interface ProductPriceMapper {
    @Mapping(target = "productId", source = "id.productId")
    @Mapping(target = "priceDateTime", source = "id.priceDateTime")
    ProductPriceDto toDto(ProductPrice entity);

    @Mapping(target = "id.productId", source = "productId")
    @Mapping(target = "id.priceDateTime", source = "priceDateTime")
    @Mapping(target = "product", ignore = true)
    ProductPrice toEntity(ProductPriceDto dto);
}
