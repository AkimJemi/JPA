package com.pro.spring.service.impl;

import com.pro.spring.entity.UserEntity;
import com.pro.spring.handler.UserHandler;
import com.pro.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    UserHandler userHandler;

    @Autowired
    public UserServiceImpl(UserHandler userHandler) {
        this.userHandler = userHandler;
    }


    @Override
    public void save(UserEntity userEntity) {
        userHandler.save(userEntity);
    }
}
