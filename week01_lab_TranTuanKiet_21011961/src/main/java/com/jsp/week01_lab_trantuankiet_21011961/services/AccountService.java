package com.jsp.week01_lab_trantuankiet_21011961.services;


import com.jsp.week01_lab_trantuankiet_21011961.dtos.AccountDto;

import java.util.List;

public interface AccountService {
    AccountDto login(AccountDto accountDto);

    void logout(AccountDto account);

    List<AccountDto> getAllAccount();

    AccountDto getById(String accountId);

    AccountDto save(AccountDto accountDto);
}
