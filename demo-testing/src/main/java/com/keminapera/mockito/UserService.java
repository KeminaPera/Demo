package com.keminapera.mockito;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/6/15 下午9:57
 */
public class UserService {
    private final UserDao userDao;
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }
    public void insertOrUpdate(User user) {
        User userExisted = userDao.get(user.getId());
        if (userExisted == null) {
            userDao.insert(user);
        } else {
            userDao.update(user);
        }
    }
}
