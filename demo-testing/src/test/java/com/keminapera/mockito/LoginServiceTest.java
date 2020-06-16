package com.keminapera.mockito;

import org.mockito.Mock;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.mockito.Mockito.*;
import static org.testng.Assert.assertEquals;

public class LoginServiceTest {
    @Mock
    private AccountDao accountDao;

    @BeforeMethod
    public void setUp() {
        accountDao = mock(AccountDao.class);
    }

    @Test
    public void testLogin() {
        //模拟
        LoginService loginService = new LoginService(accountDao);
        when(accountDao.login(eq("keminapera"), eq("123"))).thenReturn(new Account());
        loginService.login("keminapera", "123");
        verify(accountDao).login(eq("keminapera"), eq("123"));
    }

    @Test
    public void testLogin01() {
        LoginService loginService = new LoginService(accountDao);
        when(accountDao.login(anyString(),anyString()))
                .thenReturn(new Account())
                .thenReturn(new Account("hello", "world"));

        loginService.login("zhangsan", "123");
        //verify(loginService).login(anyString(), anyString());

        Account account = loginService.login(anyString(), anyString());
        assertEquals(account.getUserName(), "hello");
    }

}