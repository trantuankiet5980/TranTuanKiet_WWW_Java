package vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.repositories;

import vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.enums.ProductStatus;
import vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.models.Product;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<Product> findAll();
    Optional<Product> findById(Long id);
    Product save(Product product);
    boolean updateStatus(Long id, ProductStatus status);
    List<Product> findByStatus(ProductStatus status);
}
