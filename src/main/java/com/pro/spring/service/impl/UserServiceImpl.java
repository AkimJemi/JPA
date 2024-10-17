package com.pro.spring.service.impl;

import com.pro.spring.entity.UserEntity;
import com.pro.spring.handler.UserHandler;
import com.pro.spring.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserHandler userHandler;

    @Override
    public UserEntity save(UserEntity user) {
        return userHandler.save(user);
    }

    @Override
    public List<UserEntity> saveAll(List<UserEntity> users) {
        return userHandler.saveAll(users);
    }

    @Override
    public UserEntity findUserById(Long id) {
        return userHandler.findUserById(id);
    }

    @Override
    public List<UserEntity> findAllUser() {
        return userHandler.findAllUser();
    }

    @Override
    public UserEntity deleteUserById(Long id) {
        return userHandler.deleteUserById(id);
    }

    @Override
    public List<UserEntity> deleteAllUser() {
        return userHandler.deleteAllUser();
    }
}
