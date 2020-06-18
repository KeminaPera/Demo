package com.keminapera.powermock;

import com.keminapera.mockito.User;
import com.keminapera.mockito.mock01.UserDao01;
import com.keminapera.mockito.mock01.UserService01;
import org.junit.Test;
import org.powermock.api.mockito.PowerMockito;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.anyInt;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/6/16 下午9:46
 */
public class UserServiceTest00 {

    @Test
    public void getTop3WithMock() {
        //准备数据
        UserDao01 mockUserDao = PowerMockito.mock(UserDao01.class);
        UserService01 userService = new UserService01(mockUserDao);
        //打桩
        PowerMockito.when(mockUserDao.getCount()).thenReturn(999);
        PowerMockito.when(mockUserDao.getTop(3)).thenReturn(Arrays.asList(new User("001", "亚索", 21)));
        //执行
        List<User> actaul = userService.getTop3();
        //校验
        User user = actaul.get(0);
        assertThat(user.getName(), is("亚索"));
    }

    @Test
    public void getTop3WithSpy() {
        //准备数据
        UserDao01 userDao01 = new UserDao01();
        UserDao01 userDao = PowerMockito.spy(userDao01);
        UserService01 userService = new UserService01(userDao);
        //打桩
        PowerMockito.when(userDao.getTop(anyInt())).thenReturn(Arrays.asList(new User("001", "许褚", 37)));
        //执行
        List<User> actual = userService.getTop3();
        //校验
        User user = actual.get(0);
        assertThat(user.getName(), is("许褚"));
    }
}
