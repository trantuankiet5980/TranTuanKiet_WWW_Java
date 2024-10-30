package vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.services;

import vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.dtos.ProductDto;
import vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.enums.ProductStatus;
import vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.models.ProductPrice;

import java.util.List;

public interface ProductService {
    List<ProductDto> getAll();
    ProductDto getById(Long id);
    ProductDto save(ProductDto product);
    boolean updateStatus(Long id, ProductStatus status);
    ProductDto savePrice(ProductPrice productPrice);
    List<ProductDto> getProductsByStatusAndPriceLatest(ProductStatus status);



}
