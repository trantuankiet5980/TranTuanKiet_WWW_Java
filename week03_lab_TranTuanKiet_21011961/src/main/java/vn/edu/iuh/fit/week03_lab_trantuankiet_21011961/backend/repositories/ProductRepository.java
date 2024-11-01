package vn.edu.iuh.fit.week03_lab_trantuankiet_21011961.backend.repositories;

import vn.edu.iuh.fit.week03_lab_trantuankiet_21011961.backend.entities.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<Product> findAll();
    Optional<Product> findById(Long id);
    Product save(Product product);
}
