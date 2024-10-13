package com.pro.spring.controller;

import com.pro.spring.entity.UserEntity;
import com.pro.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
public class UserController {

    UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user/insert")
    public ResponseEntity<UserEntity> initPage(String userName) {
        UserEntity user = userService.save(new UserEntity(userName));
        return ResponseEntity.ok(user);
    }

    @PutMapping("/user/batch/put")
    public ResponseEntity<List<UserEntity>> batchAllUsers() {
        List<UserEntity> users = IntStream.concat(IntStream.rangeClosed(65, 90), IntStream.rangeClosed(97, 122)).mapToObj(a -> new UserEntity(String.valueOf((char) a))).collect(Collectors.toList());
        List<UserEntity> user = userService.saveAll(users);
        return ResponseEntity.ok(user);
    }

    @PostMapping("/user/batch/post")
    public ResponseEntity<List<UserEntity>> batchAllUsers(@RequestBody List<UserEntity> users) {
        List<UserEntity> user = userService.saveAll(users);
        return ResponseEntity.ok(user);
    }

    @GetMapping("/user/find")
    public ResponseEntity<UserEntity> findUserById(int id) {
        UserEntity user = userService.findUserById(id);
        return ResponseEntity.ok(user);
    }

    @GetMapping("/user/findAll")
    public ResponseEntity<List<UserEntity>> findAllUser() {
        List<UserEntity> user = userService.findAllUser();
        return ResponseEntity.ok(user);
    }

    @DeleteMapping("/user/delete")
    public ResponseEntity<UserEntity> deleteUserById(int id) {
        UserEntity user = userService.deleteUserById(id);
        return ResponseEntity.ok(user);
    }

    @DeleteMapping("/user/deleteAll")
    public ResponseEntity<List<UserEntity>> deleteAllUsers() {
        List<UserEntity> user = userService.deleteAllUser();
        return ResponseEntity.ok(user);
    }
}
