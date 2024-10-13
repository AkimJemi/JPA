package com.pro.spring.repository;

import com.pro.spring.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository<AccountEntity, String> {

    AccountEntity findAccountById(Long id);
}
