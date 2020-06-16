package com.keminapera.mockito;

import org.springframework.stereotype.Service;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/5/24 下午3:33
 */
@Service
public class LoginService {

    private final AccountDao accountDao;

    public LoginService(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public Account login(String userName, String password) {
        userName = userName + "==";
        password = password + "--";
        return accountDao.login(userName, password);
    }
}
