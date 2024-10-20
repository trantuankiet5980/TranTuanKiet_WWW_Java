package com.jsp.week01_lab_trantuankiet_21011961.services.impl;

import com.jsp.week01_lab_trantuankiet_21011961.dtos.AccountDto;
import com.jsp.week01_lab_trantuankiet_21011961.entities.Account;
import com.jsp.week01_lab_trantuankiet_21011961.entities.GrantAccess;
import com.jsp.week01_lab_trantuankiet_21011961.entities.GrantAccessId;
import com.jsp.week01_lab_trantuankiet_21011961.entities.Role;
import com.jsp.week01_lab_trantuankiet_21011961.mapper.AccountMapper;
import com.jsp.week01_lab_trantuankiet_21011961.mapper.GrantAccessMapper;
import com.jsp.week01_lab_trantuankiet_21011961.repositories.AccountRepository;
import com.jsp.week01_lab_trantuankiet_21011961.repositories.GrantAccessRepository;
import com.jsp.week01_lab_trantuankiet_21011961.repositories.LogRepository;
import com.jsp.week01_lab_trantuankiet_21011961.services.AccountService;
import jakarta.inject.Inject;


import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class AccountServiceImpl implements AccountService {
    @Inject
    private AccountRepository accountRepository;
    @Inject
    private AccountMapper accountMapper;
    @Inject
    private GrantAccessRepository grantAccessRepository;
    @Inject
    private LogRepository logRepository;
    @Inject
    private GrantAccessMapper grantAccessMapper;
    @Override
    public AccountDto login(AccountDto accountDto) {
        Account account = accountRepository.findByAccountIdAndPassword(accountDto.getAccountId(), accountDto.getPassword());

        if (account != null) {
            logRepository.saveTimeLogin(account.getAccountId());
            return accountMapper.toDTO(account);
        }
        return null;
    }

    @Override
    public void logout(AccountDto account) {
        logRepository.saveTimeLogout(account.getAccountId());
    }

    @Override
    public List<AccountDto> getAllAccount() {
        return accountRepository.findAllAccountNotIsAdmin().stream()
                .map(account -> accountMapper.toDTO(account))
                .collect(Collectors.toList());
    }

    @Override
    public AccountDto getById(String accountId) {
        return accountMapper.toDTO(accountRepository.findByAccountId(accountId));
    }

    @Override
    public AccountDto save(AccountDto accountDto) {
        Account account = accountMapper.toEntity(accountDto);
        account = accountRepository.save(account);
        String id = account.getAccountId();
        if(account.getAccountId() != null) {

            accountDto.getGrantAccesses().forEach(g -> {
                GrantAccess grantAccess = grantAccessMapper.toEntity(g);
                GrantAccessId grantAccessId = new GrantAccessId();
                grantAccessId.setAccountId(id);
                grantAccessId.setRoleId(g.getRole().getRoleId());
                grantAccess.setId(grantAccessId);

                Account accountTemp = new Account();
                accountTemp.setAccountId(id);

                grantAccess.setAccount(accountTemp);
                Role role = new Role();
                role.setRoleId(g.getRole().getRoleId());
                grantAccess.setRole(role);

                grantAccessRepository.save(grantAccess);
            });
        }
        return accountMapper.toDTO(account);
    }

}
