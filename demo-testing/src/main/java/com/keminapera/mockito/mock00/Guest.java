package com.keminapera.mockito.mock00;

import java.util.Optional;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/6/18 下午10:06
 */
public class Guest {
    public void print(String content) {
        System.out.println(content);
    }

    public String toUpper(String content) {
        return Optional.ofNullable(content)
                .map(String::toUpperCase)
                .orElse(null);
    }

    public String getContentFromDb() {
        //现在数据库不可用
        throw new UnsupportedOperationException("不支持异常!!!");
    }
}
