package com.keminapera.springboot.controller;

import com.keminapera.springboot.pojo.User;
import com.keminapera.springboot.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private UserService userService;
    private UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> selectById(@PathVariable("id") Integer id) {
        User user = userService.selectById(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
