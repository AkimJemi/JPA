package com.pro.spring.repository;

import com.pro.spring.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, String> {

    UserEntity findUserById(Long id);
}
