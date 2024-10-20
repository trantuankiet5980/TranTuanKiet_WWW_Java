package com.jsp.week01_lab_trantuankiet_21011961.dtos;

import lombok.*;

import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RoleDto implements Serializable {
    String roleId;
    String roleName;
    String description;
    Byte status;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RoleDto roleDto = (RoleDto) o;

        return roleId.equals(roleDto.roleId);
    }

    @Override
    public int hashCode() {
        return roleId.hashCode();
    }
}