package vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.mapper;

import org.mapstruct.*;
import vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.dtos.OrderDto;
import vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.models.Order;

@Mapper(uses = {OrderDetailMapper.class, CustomerMapper.class, EmployeeMapper.class})
public interface OrderMapper {
    Order toEntity(OrderDto orderDto);

    OrderDto toDto(Order order);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Order partialUpdate(OrderDto orderDto, @MappingTarget Order order);
}

