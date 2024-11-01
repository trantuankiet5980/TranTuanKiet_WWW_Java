package vn.edu.iuh.fit.week03_lab_trantuankiet_21011961.fontend.models;

import jakarta.ejb.Remote;
import vn.edu.iuh.fit.week03_lab_trantuankiet_21011961.backend.dtos.ProductDto;
import vn.edu.iuh.fit.week03_lab_trantuankiet_21011961.backend.dtos.ProductPriceDto;

import java.util.List;

@Remote
public interface ProductModel {
    List<ProductDto> findAll();
    ProductDto addPrice(Long productId, ProductPriceDto productPriceDto);

    ProductDto findById(Long id);

    ProductDto save(ProductDto productDto);
}
