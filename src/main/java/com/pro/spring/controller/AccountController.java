package com.pro.spring.controller;

import com.pro.spring.entity.AccountEntity;
import com.pro.spring.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;

    @PutMapping("/account/batch/put")
    public ResponseEntity<List<AccountEntity>> batchAllAccounts() {
        List<AccountEntity> accounts = IntStream.concat(IntStream.rangeClosed(65, 90), IntStream.rangeClosed(97, 122)).mapToObj(a -> new AccountEntity(String.valueOf((char) a))).collect(Collectors.toList());
        List<AccountEntity> account = accountService.saveAll(accounts);
        return ResponseEntity.ok(account);
    }

    @PostMapping("/account/batch/post")
    public ResponseEntity<List<AccountEntity>> batchAllAccounts(@RequestBody List<AccountEntity> accounts) {
        List<AccountEntity> account = accountService.saveAll(accounts);
        return ResponseEntity.ok(account);
    }

    @GetMapping("/account/find")
    public ResponseEntity<AccountEntity> findAccountById(Long id) {
        AccountEntity account = accountService.findAccountById(id);
        return ResponseEntity.ok(account);
    }

    @GetMapping("/account/findAll")
    public ResponseEntity<List<AccountEntity>> findAllAccount() {
        List<AccountEntity> account = accountService.findAllAccount();
        return ResponseEntity.ok(account);
    }

    @DeleteMapping("/account/delete")
    public ResponseEntity<AccountEntity> deleteAccountById(@RequestBody AccountEntity account) {
        AccountEntity deletedAccount = accountService.deleteAccountById(account.getId());
        return ResponseEntity.ok(deletedAccount);
    }

    @DeleteMapping("/account/deleteAll")
    public ResponseEntity<List<AccountEntity>> deleteAllAccounts() {
        List<AccountEntity> account = accountService.deleteAllAccount();
        return ResponseEntity.ok(account);
    }

    @PatchMapping("/account/update")
    public ResponseEntity<AccountEntity> updateAccountById(@RequestBody AccountEntity account) {
        AccountEntity updatedAccount = accountService.updateAccount(account);
        return ResponseEntity.ok(updatedAccount);
    }
}
