package vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.services.impl;

import jakarta.inject.Inject;
import vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.dtos.CustomerDto;
import vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.mapper.CustomerMapper;
import vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.models.Customer;
import vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.repositories.CustomerRepository;
import vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.services.CustomerService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CustomerServiceImpl implements CustomerService {

    @Inject
    private CustomerRepository customerRepository;
    @Inject
    private CustomerMapper customerMapper;
    @Override
    public List<CustomerDto> getAll() {
        return customerRepository.findAll().stream().map(customerMapper::toDto).collect(Collectors.toList());
    }

    @Override
    public CustomerDto getById(Long id) {
        Optional<Customer> customer = customerRepository.findById(id);
        return customer.map(customerMapper::toDto).orElse(null);
    }

    @Override
    public CustomerDto save(CustomerDto customer) {
        Customer customerNew = customerMapper.toEntity(customer);
        if(customerNew.getId() != null){
            Customer oldCustomer = customerRepository.findById(customerNew.getId()).orElse(null);
            if(oldCustomer != null){
                customerNew = customerMapper.partialUpdate(customer, oldCustomer);
            }
        }

        customerNew = customerRepository.save(customerNew);

        return customerMapper.toDto(customerNew);
    }

    @Override
    public boolean delete(Long id) {
        return customerRepository.delete(id);
    }

    @Override
    public CustomerDto getByPhone(String phone) {
        Customer customer = customerRepository.findByPhone(phone);
        return customerMapper.toDto(customer);
    }
}
