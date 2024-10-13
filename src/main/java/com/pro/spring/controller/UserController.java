package com.pro.spring.controller;

import com.pro.spring.entity.UserEntity;
import com.pro.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.util.List;

@Controller
public class UserController {

    UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public ResponseEntity<UserEntity> initPage(String userName) {
        UserEntity user = userService.save(new UserEntity(userName));
        return ResponseEntity.ok(user);
    }

    @PostMapping("/batch")
    public ResponseEntity<List<UserEntity>> insertAllUsers(@RequestBody List<UserEntity> users) {
        List<UserEntity> savedUsers = userService.saveAll(users);
        return ResponseEntity.ok(savedUsers);
    }
}
