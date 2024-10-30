package vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.repositories;

import vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.enums.EmployeeStatus;
import vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.models.Employee;

import java.util.List;
import java.util.Optional;


public interface EmployeeRepository {
    List<Employee> findAll();
    Employee updateStatus(Long id, EmployeeStatus status);
    Optional<Employee> findByPhone(String phone);
    Optional<Employee> findById(Long id);
    Employee save(Employee employee);
}
