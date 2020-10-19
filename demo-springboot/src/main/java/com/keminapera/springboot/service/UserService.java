package com.keminapera.springboot.service;

import com.keminapera.springboot.dao.UserDao;
import com.keminapera.springboot.pojo.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public UserDao userDao;
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }
    public User selectById(Integer id) {
        return null;/*userDao.selectById(id);*/
    }
}
