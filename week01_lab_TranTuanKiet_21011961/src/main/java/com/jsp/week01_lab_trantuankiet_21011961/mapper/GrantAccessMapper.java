package com.jsp.week01_lab_trantuankiet_21011961.mapper;

import com.jsp.week01_lab_trantuankiet_21011961.dtos.GrantAccessDto;
import com.jsp.week01_lab_trantuankiet_21011961.dtos.GrantAccessIdDto;
import com.jsp.week01_lab_trantuankiet_21011961.entities.GrantAccess;
import com.jsp.week01_lab_trantuankiet_21011961.entities.GrantAccessId;
import jakarta.inject.Inject;

public class GrantAccessMapper {
    @Inject
    private RoleMapper roleMapper;
    public GrantAccessDto toDTO(GrantAccess entity){
        GrantAccessDto dto = new GrantAccessDto();

        GrantAccessIdDto grantAccessIdDto = new GrantAccessIdDto();
        grantAccessIdDto.setAccountId(entity.getId().getAccountId());
        grantAccessIdDto.setRoleId(entity.getId().getRoleId());
        dto.setId(grantAccessIdDto);

        dto.setIsGrant(entity.getIsGrant());
        dto.setNote(entity.getNote());
        dto.setRole(roleMapper.toDTO(entity.getRole()));
        return dto;
    }
    public GrantAccess toEntity(GrantAccessDto grantAccessDto) {
        GrantAccess entity = new GrantAccess();

        GrantAccessId grantAccessId = new GrantAccessId();
        grantAccessId.setAccountId(grantAccessDto.getAccount().getAccountId());
        grantAccessId.setRoleId(grantAccessDto.getRole().getRoleId());

        entity.setId(grantAccessId);
        entity.setIsGrant(grantAccessDto.getIsGrant());
        entity.setNote(grantAccessDto.getNote());

        return entity;
    }

}
