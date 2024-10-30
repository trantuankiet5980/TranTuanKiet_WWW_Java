package vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.mapper;

import org.mapstruct.*;
import vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.dtos.CustomerDto;
import vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.models.Customer;

@Mapper
public interface CustomerMapper {
    @Mapping(target = "orders", ignore = true)
    Customer toEntity(CustomerDto customerDto);

    CustomerDto toDto(Customer customer);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "orders", ignore = true)
    Customer partialUpdate(CustomerDto customerDto, @MappingTarget Customer customer);
}