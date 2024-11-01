package vn.edu.iuh.fit.week03_lab_trantuankiet_21011961.backend.services;

import jakarta.ejb.Remote;
import vn.edu.iuh.fit.week03_lab_trantuankiet_21011961.backend.dtos.ProductDto;
import vn.edu.iuh.fit.week03_lab_trantuankiet_21011961.backend.dtos.ProductPriceDto;

import java.util.List;

@Remote
public interface ProductBeanRemote {
    List<ProductDto> getAll();
    ProductDto getById(Long id);
    ProductDto save(ProductDto productDto) throws Exception;
    ProductDto addPrice(Long productId, ProductPriceDto productPriceDto) throws Exception;
}
