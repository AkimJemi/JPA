package com.pro.spring.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "accounts")
@Data
@NoArgsConstructor
public class AccountEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private String userId;

    @Column(name = "account_number", nullable = true, unique = true)
    private String accountNumber;

    @Column(name = "account_name")
    private String accountName;

    @Column(name = "balance")
    private BigDecimal balance;

    @Column(name = "account_type")
    private String accountType;

    public AccountEntity(String userid) {
        this.userId = userid;
    }

    public AccountEntity(String userId, String accountNumber, String accountName, BigDecimal balance, String accountType) {
        this.userId = userId;
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
        this.accountType = accountType;
    }
}
