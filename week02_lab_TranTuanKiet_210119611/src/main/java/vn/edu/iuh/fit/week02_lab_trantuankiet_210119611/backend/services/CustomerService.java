package vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.services;

import vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.dtos.CustomerDto;

import java.util.List;


public interface CustomerService {
    List<CustomerDto> getAll();
    CustomerDto getById(Long id);
    CustomerDto save(CustomerDto customer);
    boolean delete(Long id);
    CustomerDto getByPhone(String phone);
}
