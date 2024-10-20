package com.jsp.week01_lab_trantuankiet_21011961.repositories;

import com.jsp.week01_lab_trantuankiet_21011961.entities.Account;

import java.util.List;

public interface AccountRepository {
    Account findByAccountIdAndPassword(String accountId, String password);

    List<Account> findAllAccountNotIsAdmin();

    Account findByAccountId(String accountId);

    Account save(Account account);
}
