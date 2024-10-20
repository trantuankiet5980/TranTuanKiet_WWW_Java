package com.jsp.week01_lab_trantuankiet_21011961.repositories.impl;


import com.jsp.week01_lab_trantuankiet_21011961.entities.Role;
import com.jsp.week01_lab_trantuankiet_21011961.repositories.RoleRepository;
import com.jsp.week01_lab_trantuankiet_21011961.utils.AppUtils;

import java.util.List;

public class RoleRepositoryImpl implements RoleRepository {

    @Override
    public List<Role> findAll() {
        try(var em = AppUtils.getEntityManager()) {
            return em.createNamedQuery("Role.findAll", Role.class)
                    .getResultList();
        }
    }
}
