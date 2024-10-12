package com.pro.spring.controller;

import com.pro.spring.entity.UserEntity;
import com.pro.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;

@Controller
public class UserController {

    UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    @ResponseBody
    public String initPage() {

        userService.save(new UserEntity("2", LocalDateTime.now(),
                LocalDateTime.now()));
        return "initPage";
    }
}
