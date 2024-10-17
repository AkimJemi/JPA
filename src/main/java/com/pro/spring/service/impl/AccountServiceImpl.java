package com.pro.spring.service.impl;

import com.pro.spring.entity.AccountEntity;
import com.pro.spring.handler.AccountHandler;
import com.pro.spring.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountHandler accountHandler;

    @Override
    public AccountEntity save(AccountEntity account) {
        return accountHandler.save(account);
    }

    @Override
    public List<AccountEntity> saveAll(List<AccountEntity> accounts) {
        return accountHandler.saveAll(accounts);
    }

    @Override
    public AccountEntity findAccountById(Long id) {
        return accountHandler.findAccountById(id);
    }

    @Override
    public List<AccountEntity> findAllAccount() {
        return accountHandler.findAllAccount();
    }

    @Override
    public AccountEntity deleteAccountById(Long id) {
        return accountHandler.deleteAccountById(id);
    }

    @Override
    public List<AccountEntity> deleteAllAccount() {
        return accountHandler.deleteAllAccount();
    }

    @Override
    public AccountEntity updateAccount(AccountEntity account) {
        return accountHandler.updateAccount(account);
    }
}
