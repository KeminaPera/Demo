package com.keminapera.concurrent.wangwenjun.threadlocal;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/7/19 上午12:21
 */
public class User {
    private final String name;
    private final Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "[name=" + name + "----age=" + age + "]";
    }
}
