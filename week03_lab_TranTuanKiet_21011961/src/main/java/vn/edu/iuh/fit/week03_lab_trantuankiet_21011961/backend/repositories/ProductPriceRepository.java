package vn.edu.iuh.fit.week03_lab_trantuankiet_21011961.backend.repositories;

import vn.edu.iuh.fit.week03_lab_trantuankiet_21011961.backend.entities.ProductPrice;

public interface ProductPriceRepository {
    ProductPrice findActiveByProductId(Long productId);
}
