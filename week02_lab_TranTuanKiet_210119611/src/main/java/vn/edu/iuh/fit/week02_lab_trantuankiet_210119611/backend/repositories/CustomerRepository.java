package vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.repositories;


import vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.models.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository {
    List<Customer> findAll();
    Optional<Customer> findById(Long id);
    Customer save(Customer customer);
    boolean delete(Long id);
    Customer findByPhone(String phone);
}
