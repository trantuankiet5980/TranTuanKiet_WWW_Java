package com.jsp.week01_lab_trantuankiet_21011961.dtos;

import lombok.*;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AccountDto implements Serializable {
    public String accountId;
    public String fullName;
    public String password;
    public String email;
    public String phone;
    public Byte status;
    public Set<GrantAccessDto> grantAccesses = new LinkedHashSet<>();
    public boolean isRole(String roleId) {
        for (GrantAccessDto ga : grantAccesses) {
            if (ga.getRole().getRoleId().equals(roleId)) {
                return true;
            }
        }
        return false;
    }

}