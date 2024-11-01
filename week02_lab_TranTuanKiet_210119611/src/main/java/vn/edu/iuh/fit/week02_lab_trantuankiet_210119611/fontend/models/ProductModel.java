package vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.fontend.models;

import jakarta.ejb.Remote;
import vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.dtos.ProductDto;

import java.util.List;


@Remote
public interface ProductModel {

    List<ProductDto> findAll();

    ProductDto findById(Long id);
}
