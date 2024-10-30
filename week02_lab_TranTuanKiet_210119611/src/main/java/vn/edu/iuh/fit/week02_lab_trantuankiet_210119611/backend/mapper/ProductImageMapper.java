package vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.dtos.ProductImageDto;
import vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.models.ProductImage;

@Mapper
public interface ProductImageMapper {
    @Mapping(target = "productId", source = "product.id")
    ProductImageDto toDto(ProductImage entity);
    @Mapping(target = "product.id", source = "productId")
    ProductImage toEntity(ProductImageDto dto);

}
