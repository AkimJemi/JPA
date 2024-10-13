package com.pro.spring.handler.impl;

import com.pro.spring.entity.AccountEntity;
import com.pro.spring.handler.AccountHandler;
import com.pro.spring.repository.AccountRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountHandlerImpl implements AccountHandler {

    AccountRepository accountRepository;

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    public AccountHandlerImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountEntity save(AccountEntity accountEntity) {
        return accountRepository.save(accountEntity);
    }

    @Override
    public List<AccountEntity> saveAll(List<AccountEntity> accounts) {
        return accountRepository.saveAll(accounts);
    }

    @Override
    public AccountEntity findAccountById(Long id) {
        return accountRepository.findAccountById(id);
    }

    @Override
    public List<AccountEntity> findAllAccount() {
        return accountRepository.findAll();
    }

    @Override
    public AccountEntity deleteAccountById(Long id) {
        accountRepository.deleteById(String.valueOf(id));
        return accountRepository.findAccountById(id);
    }

    @Override
    public List<AccountEntity> deleteAllAccount() {
        accountRepository.deleteAll();
        return accountRepository.findAll();
    }

    @Transactional
    public AccountEntity updateAccount(AccountEntity account) {
        return entityManager.merge(account);
    }
}
