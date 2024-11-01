package vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.fontend.models;

import jakarta.servlet.http.HttpServletRequest;
import vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.dtos.OrderDto;

public interface CartModel {
    void addProduct(Long productId, String note, Long quantity, HttpServletRequest req);

    void removeProduct(Long productId, HttpServletRequest req);

    void updateProduct(Long productId, Long quantity, HttpServletRequest req);

    void clearCart(HttpServletRequest req);

    Cart getCart(HttpServletRequest req);

    OrderDto toDto(HttpServletRequest req);
}
