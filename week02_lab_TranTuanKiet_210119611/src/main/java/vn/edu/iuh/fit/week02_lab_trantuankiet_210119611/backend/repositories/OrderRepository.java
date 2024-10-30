package vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.repositories;

import vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.models.Order;

import java.util.List;

public interface OrderRepository {
    List<Order> findAll();
    Order findById(Long id);
    Order save(Order order);

}
