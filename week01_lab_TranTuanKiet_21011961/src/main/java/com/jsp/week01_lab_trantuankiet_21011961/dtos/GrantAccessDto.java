package com.jsp.week01_lab_trantuankiet_21011961.dtos;

import lombok.*;
import lombok.Value;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GrantAccessDto implements Serializable {
    GrantAccessIdDto id;
    RoleDto role;
    AccountDto account;
    Boolean isGrant;
    String note;
}