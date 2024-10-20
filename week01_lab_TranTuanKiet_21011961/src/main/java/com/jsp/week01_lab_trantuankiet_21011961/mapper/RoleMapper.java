package com.jsp.week01_lab_trantuankiet_21011961.mapper;

import com.jsp.week01_lab_trantuankiet_21011961.dtos.RoleDto;
import com.jsp.week01_lab_trantuankiet_21011961.entities.Role;

public class RoleMapper {
    public RoleDto toDTO(Role entity){
        RoleDto dto = new RoleDto();
        dto.setRoleId(entity.getRoleId());
        dto.setRoleName(entity.getRoleName());
        dto.setDescription(entity.getDescription());
        dto.setStatus(entity.getStatus());
        return dto;
    }
}
