package com.keminapera.springboot.dao;

import com.keminapera.springboot.mapper.UserMapper;
import com.keminapera.springboot.pojo.User;
import org.springframework.stereotype.Component;

@Component
public class UserDao {
    private UserMapper userMapper;
    public UserDao(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User selectById(Integer id) {
        return userMapper.selectById(id);
    }
}
