package com.jsp.week01_lab_trantuankiet_21011961.services;

import com.jsp.week01_lab_trantuankiet_21011961.models.Account;
import com.jsp.week01_lab_trantuankiet_21011961.repositories.AccountRepository;
import jakarta.inject.Inject;

import java.util.List;

public class AccountService {

    @Inject
    private AccountRepository accountRepository;

    public void addAccount(Account account) {
        accountRepository.save(account);
    }

    public void updateAccount(Account account) {
        accountRepository.update(account);
    }

    public void deleteAccount(int accountId) {
        Account account = accountRepository.findById(accountId);
        if (account != null) {
            accountRepository.delete(account);
        }
    }

    public Account getAccountById(int id) {
        return accountRepository.findById(id);
    }

    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }
}
