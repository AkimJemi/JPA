package com.pro.spring.handler.impl;

import com.pro.spring.entity.UserEntity;
import com.pro.spring.handler.UserHandler;
import com.pro.spring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserHandlerImpl implements UserHandler {

    UserRepository userRepository;

    @Autowired
    public UserHandlerImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void save(UserEntity userEntity) {
        userRepository.save(userEntity);
    }
}
