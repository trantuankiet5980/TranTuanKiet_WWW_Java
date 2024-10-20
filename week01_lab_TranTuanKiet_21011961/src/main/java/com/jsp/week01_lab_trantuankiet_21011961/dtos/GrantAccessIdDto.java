package com.jsp.week01_lab_trantuankiet_21011961.dtos;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GrantAccessIdDto implements Serializable {
    String roleId;
    String accountId;
}