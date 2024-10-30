package vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.services;

import vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.dtos.OrderDto;

import java.util.List;

public interface OrderService {
    List<OrderDto> findAll();
    OrderDto findById(Long id);
    OrderDto save(OrderDto order);
}
