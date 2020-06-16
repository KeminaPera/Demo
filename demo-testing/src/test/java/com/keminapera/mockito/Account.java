package com.keminapera.mockito;

import lombok.Data;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/5/24 下午3:34
 */
@Data
public class Account {
    private String userName;
    private String password;

    public Account() {
        this.userName = "userName";
        this.password = "password";
    }

    public Account(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

}
