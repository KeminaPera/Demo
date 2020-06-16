package com.keminapera.mockito;

import org.springframework.stereotype.Component;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/6/15 下午9:57
 */
@Component
public class UserDao {
    public void insert(User user) {
        throw new UnsupportedOperationException("数据库暂时不可用！");
    }

    public void update(User user) {
        throw new UnsupportedOperationException("数据库暂时不可用");
    }

    public User get(String userId) {
        return new User(userId, "kemina", 18);
    }


}
