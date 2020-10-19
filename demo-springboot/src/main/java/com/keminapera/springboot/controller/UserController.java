package com.keminapera.springboot.controller;

import com.keminapera.module.controller.ModuleUserController;
import com.keminapera.springboot.pojo.User;
import com.keminapera.springboot.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class UserController {
    private UserService userService;
    @Autowired
    private Environment environment;

    @Autowired
    private CacheManager cacheManager;

    @Autowired
    private ApplicationContext context;
    private UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> selectById(@PathVariable("id") Integer id) {
        User user = userService.selectById(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping("/user/name/{name}")
    public ResponseEntity<String> sayHello(@PathVariable("name") String name) {
        ModuleUserController moduleUserController = context.getBean(ModuleUserController.class);
        moduleUserController.sayHello();
        log.info("UserController 接收到了请求....");
        return new ResponseEntity<>(name + "sayHello", HttpStatus.OK);
    }
}

