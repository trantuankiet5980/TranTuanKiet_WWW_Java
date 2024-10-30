package vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.mapper;

import org.mapstruct.*;
import vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.dtos.EmployeeDto;
import vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.models.Employee;

@Mapper
public interface EmployeeMapper {
    @Mapping(target = "orders", ignore = true)
    Employee toEntity(EmployeeDto employeeDto);

    EmployeeDto toDto(Employee employee);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Employee partialUpdate(EmployeeDto employeeDto, @MappingTarget Employee employee);
}