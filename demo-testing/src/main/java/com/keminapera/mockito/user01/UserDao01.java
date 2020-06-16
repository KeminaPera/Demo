package com.keminapera.mockito.user01;

import com.keminapera.mockito.User;

import java.util.Arrays;
import java.util.List;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/6/15 下午10:26
 */
public class UserDao01 {
    public int getCount() {
        System.out.println("执行了UserDao01的getCount方法...");
        return 2;
    }

    public List<User> getTop(int topNumber) {
        System.out.println("执行了UserDao01的getTop方法...");
        return Arrays.asList(new User("1", "陈冠希", 22), new User("2", "罗志祥", 38));
    }
}
