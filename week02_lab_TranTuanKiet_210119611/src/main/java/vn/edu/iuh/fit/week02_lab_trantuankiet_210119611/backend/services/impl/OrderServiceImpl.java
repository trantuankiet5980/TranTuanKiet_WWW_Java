package vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.services.impl;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.dtos.OrderDto;
import vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.mapper.CustomerMapper;
import vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.mapper.OrderDetailMapper;
import vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.mapper.OrderMapper;
import vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.models.Customer;
import vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.models.Order;
import vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.models.OrderDetail;
import vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.models.Product;
import vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.repositories.*;
import vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.services.OrderService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OrderServiceImpl implements OrderService {
    @Inject
    private OrderRepository orderRepository;
    @Inject
    private OrderMapper orderMapper;
    @Inject
    private ProductPriceRepository productPriceRepository;
    @Inject
    private OrderDetailMapper orderDetailMapper;
    @Inject
    private OrderDetailRepository orderDetailRepository;
    @Inject
    private ProductRepository productRepository;
    @Inject
    private CustomerRepository customerRepository;
    @Inject
    private CustomerMapper customerMapper;

    @Override
    public List<OrderDto> findAll() {
        return orderRepository
                .findAll()
                .stream()
                .map(orderMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public OrderDto findById(Long id) {
        return orderMapper.toDto(orderRepository.findById(id));
    }

    @Transactional
    @Override
    public OrderDto save(OrderDto order) {
        Order entity = orderMapper.toEntity(order);

        if(order.getId() != null) {
            Order oldOrder = orderRepository.findById(order.getId());
            if(oldOrder != null) {
                entity = orderMapper.partialUpdate(order, oldOrder);
            }
        }

        order.setOrderDate(LocalDateTime.now());
        entity.setOrderDetails(new ArrayList<>());

        if(order.getCustomer().getId() == null) {
            Customer customer = customerMapper.toEntity(order.getCustomer());
            customer = customerRepository.save(customer);
            entity.setCustomer(customer);
        }
        entity = orderRepository.save(entity);

        Order finalEntity = entity;
        List<OrderDetail> orderDetails = order.getOrderDetails().stream().map(orderDetail -> {

            OrderDetail orderDetailNew = orderDetailMapper.toEntity(orderDetail);

            Optional<Product> product = productRepository.findById(orderDetail.getProductId());
            if(product.isPresent()) {
                orderDetailNew.setOrder(finalEntity);
                orderDetailNew.setPrice(productPriceRepository.findLastByProductId(orderDetail.getProductId()).getPrice());
                orderDetailNew.setProduct(product.get());
            }

            return orderDetailNew;
        }).collect(Collectors.toList());

        orderDetails = orderDetailRepository.saveAll(orderDetails);

        entity.setOrderDetails(orderDetails);

        return orderMapper.toDto(entity);
    }
}
