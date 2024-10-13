package com.pro.spring.repository;

import com.pro.spring.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity, String> {

    UserEntity findUserById(Long id);
}
