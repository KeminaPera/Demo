package com.keminapera.mockito;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class UserServiceTest {
    @Test
    public void insertOrUpdateWithMock() {
        //准备数据
        UserDao mockUserDao = Mockito.mock(UserDao.class);
        UserService service = new UserService(mockUserDao);
        User user = new User("2020", "Jack", 56);
        //打桩
        Mockito.when(mockUserDao.get("2020")).thenReturn(null);
        //执行
        service.insertOrUpdate(user);
        //验证
        Mockito.verify(mockUserDao).insert(user);
    }
}