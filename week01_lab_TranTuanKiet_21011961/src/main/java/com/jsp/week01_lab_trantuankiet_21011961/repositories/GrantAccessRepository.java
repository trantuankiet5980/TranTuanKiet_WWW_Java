package com.jsp.week01_lab_trantuankiet_21011961.repositories;


import com.jsp.week01_lab_trantuankiet_21011961.entities.GrantAccess;

public interface GrantAccessRepository {
    public GrantAccess findByRoleIdAndAccountId(String roleId, String accountId);
    public GrantAccess save(GrantAccess grantAccess);
}
