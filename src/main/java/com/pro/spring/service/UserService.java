package com.pro.spring.service;

import com.pro.spring.entity.UserEntity;

import java.util.List;

public interface UserService {

    UserEntity save(UserEntity user);

    List<UserEntity> saveAll(List<UserEntity> users);

    UserEntity findUserById(Long id);

    List<UserEntity> findAllUser();

    UserEntity deleteUserById(Long id);

    List<UserEntity> deleteAllUser();
}

