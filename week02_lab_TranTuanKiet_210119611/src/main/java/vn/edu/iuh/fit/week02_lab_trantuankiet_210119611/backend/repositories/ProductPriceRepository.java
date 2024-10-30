package vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.repositories;

import vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.models.ProductPrice;

import java.util.List;

public interface ProductPriceRepository {
    List<ProductPrice> findByProductId(Long productId);
    ProductPrice save(ProductPrice productPrice);
    ProductPrice findLastByProductId(Long productId);
}
