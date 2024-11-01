package vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.fontend.models;

import jakarta.ejb.Remote;
import vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.dtos.CustomerDto;

@Remote
public interface CustomerModel {
    CustomerDto findByPhone(String phone);
}
