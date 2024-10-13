package com.pro.spring.handler;

import com.pro.spring.entity.UserEntity;

import java.util.List;

public interface UserHandler {
    UserEntity save(UserEntity userEntity);

    List<UserEntity> saveAll(List<UserEntity> users);
}
