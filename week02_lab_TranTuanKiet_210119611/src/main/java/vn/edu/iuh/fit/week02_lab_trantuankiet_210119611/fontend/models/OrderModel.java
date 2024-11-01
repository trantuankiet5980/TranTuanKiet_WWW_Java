package vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.fontend.models;

import jakarta.ejb.Remote;
import vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.dtos.OrderDto;

import java.util.List;

@Remote
public interface OrderModel {
    OrderDto save(OrderDto orderDto);
    List<OrderDto> getAll();
    OrderDto getById(Long id);
}
