package vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.repositories;

import vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.models.OrderDetail;

import java.util.List;

public interface OrderDetailRepository {
    List<OrderDetail> saveAll(List<OrderDetail> orderDetails);
}
