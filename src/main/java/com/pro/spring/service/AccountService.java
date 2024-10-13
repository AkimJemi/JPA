package com.pro.spring.service;

import com.pro.spring.entity.AccountEntity;

import java.util.List;

public interface AccountService {

    AccountEntity save(AccountEntity account);

    List<AccountEntity> saveAll(List<AccountEntity> accounts);

    AccountEntity findAccountById(Long id);

    List<AccountEntity> findAllAccount();

    AccountEntity deleteAccountById(Long id);

    List<AccountEntity> deleteAllAccount();

    AccountEntity updateAccount(AccountEntity account);
}

