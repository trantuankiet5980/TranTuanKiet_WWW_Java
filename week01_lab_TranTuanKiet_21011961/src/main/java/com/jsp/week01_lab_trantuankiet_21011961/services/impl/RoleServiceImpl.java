package com.jsp.week01_lab_trantuankiet_21011961.services.impl;

import com.jsp.week01_lab_trantuankiet_21011961.dtos.RoleDto;
import com.jsp.week01_lab_trantuankiet_21011961.mapper.RoleMapper;
import com.jsp.week01_lab_trantuankiet_21011961.repositories.RoleRepository;
import com.jsp.week01_lab_trantuankiet_21011961.services.RoleService;
import jakarta.inject.Inject;

import java.util.List;
import java.util.stream.Collectors;

public class RoleServiceImpl implements RoleService {
    @Inject
    private RoleRepository roleRepository;
    @Inject
    private RoleMapper roleMapper;

    @Override
    public List<RoleDto> getAll() {
        return roleRepository.findAll().stream()
                .map(role -> roleMapper.toDTO(role))
                .collect(Collectors.toList());
    }
}
