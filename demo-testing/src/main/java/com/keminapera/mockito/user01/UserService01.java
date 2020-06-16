package com.keminapera.mockito.user01;

import com.keminapera.mockito.User;

import java.util.List;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/6/15 下午10:22
 */
public class UserService01 {
    private UserDao01 userDao;
    public UserService01(UserDao01 userDao) {
        this.userDao = userDao;
    }
    public List<User> getTop3() {
        int count = userDao.getCount();
        System.out.println("userDao.getCount返回的结果：" + count);
        int actualCount = count < 3 ? count : 3;
        return userDao.getTop(actualCount);
    }
}
