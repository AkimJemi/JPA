package com.pro.spring.handler;

import com.pro.spring.entity.AccountEntity;

import java.util.List;

public interface AccountHandler {
    AccountEntity save(AccountEntity accountEntity);

    List<AccountEntity> saveAll(List<AccountEntity> accounts);

    AccountEntity findAccountById(Long id);

    List<AccountEntity> findAllAccount();

    AccountEntity deleteAccountById(Long id);

    List<AccountEntity> deleteAllAccount();

    AccountEntity updateAccount(AccountEntity account);
}
