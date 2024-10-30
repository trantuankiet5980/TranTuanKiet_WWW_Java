package vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.repositories;
import vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.models.ProductImage;
import java.util.List;

public interface ProductImageRepository {
    List<ProductImage> findByProductId(Long productId);
    ProductImage findById(Long id);
    ProductImage save(ProductImage productImage);
}
