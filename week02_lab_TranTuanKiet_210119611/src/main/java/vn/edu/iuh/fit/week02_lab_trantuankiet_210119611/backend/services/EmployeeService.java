package vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.services;

import vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.dtos.EmployeeDto;
import vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.enums.EmployeeStatus;

import java.util.List;
public interface EmployeeService {
    List<EmployeeDto> getAll();
    EmployeeDto getById(Long id);
    EmployeeDto save(EmployeeDto employee);
    EmployeeDto updateStatus(Long id, EmployeeStatus status);
    EmployeeDto getByPhone(String phone);
}
