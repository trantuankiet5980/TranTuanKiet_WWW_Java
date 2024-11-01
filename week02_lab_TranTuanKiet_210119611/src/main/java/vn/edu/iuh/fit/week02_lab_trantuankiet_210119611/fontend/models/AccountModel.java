package vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.fontend.models;

import jakarta.ejb.Remote;

@Remote
public interface AccountModel {
    public Account findByPhone(String phone);
}
