package vn.edu.iuh.fit.week03_lab_trantuankiet_21011961.backend.mapper;

import org.mapstruct.*;
import vn.edu.iuh.fit.week03_lab_trantuankiet_21011961.backend.dtos.ProductDto;
import vn.edu.iuh.fit.week03_lab_trantuankiet_21011961.backend.entities.Product;

@Mapper(uses = {ProductPriceMapper.class})
public interface ProductMapper {

    @Mapping(target = "productPrices", ignore = true)
    Product toEntity(ProductDto productDto);

    ProductDto toDto(Product product);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Product partialUpdate(ProductDto productDto, @MappingTarget Product product);
}