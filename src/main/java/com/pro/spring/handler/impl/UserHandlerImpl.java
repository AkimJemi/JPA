package com.pro.spring.handler.impl;

import com.pro.spring.entity.UserEntity;
import com.pro.spring.handler.UserHandler;
import com.pro.spring.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserHandlerImpl implements UserHandler {

    final private UserRepository userRepository;

    @Override
    public UserEntity save(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    @Override
    public List<UserEntity> saveAll(List<UserEntity> users) {
        return userRepository.saveAll(users);
    }

    @Override
    public UserEntity findUserById(Long id) {
        return userRepository.findUserById(id);
    }

    @Override
    public List<UserEntity> findAllUser() {
        return userRepository.findAll();
    }

    @Override
    public UserEntity deleteUserById(Long id) {
        userRepository.deleteById(String.valueOf(id));
        return userRepository.findUserById(id);
    }

    @Override
    public List<UserEntity> deleteAllUser() {
        userRepository.deleteAll();
        return userRepository.findAll();
    }
}
