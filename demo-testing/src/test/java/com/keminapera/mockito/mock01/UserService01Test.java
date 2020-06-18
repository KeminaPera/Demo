package com.keminapera.mockito.mock01;

import com.keminapera.mockito.User;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.anyInt;

public class UserService01Test {

    @Test
    public void getTop3WithMock() {
        //准备数据
        UserDao01 mockUserDao = Mockito.mock(UserDao01.class);
        UserService01 userService = new UserService01(mockUserDao);
        //打桩
        Mockito.when(mockUserDao.getCount()).thenReturn(999);
        Mockito.when(mockUserDao.getTop(3)).thenReturn(Arrays.asList(new User("001", "亚索", 21)));
        //执行
        List<User> actaul = userService.getTop3();
        //校验
        User user = actaul.get(0);
        assertThat(user.getName(), is("亚索"));
    }

    @Test
    public void getTop3WithSpy() {
        //准备数据
        UserDao01 mockUserDao = Mockito.spy(UserDao01.class);
        UserService01 userService = new UserService01(mockUserDao);
        //打桩
        Mockito.when(mockUserDao.getTop(anyInt())).thenReturn(Arrays.asList(new User("001", "许褚", 37)));
        //执行
        List<User> actual = userService.getTop3();
        //校验
        User user = actual.get(0);
        assertThat(user.getName(), is("许褚"));
    }
}