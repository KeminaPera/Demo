package com.keminapera.jdkapi.reflection;

import com.sun.istack.internal.NotNull;

/**
 * @author keminapera
 * @date 2020/10/11
 */
public class Reflaction implements Interface1 {
    //静态成员属性
    private static final String HELLO = "hello reflection";
    //成员属性
    @NotNull
    private Integer age;
    //无参构造方法
    public Reflaction() {
    }
    //有参构造
    public Reflaction(Integer age) {
        this.age = age;
    }
    //成员方法
    public Integer getAge() {
        return age;
    }
    //静态方法
    public static String getHello() {
        return HELLO;
    }

    @Override
    public void test() {
    }
}

interface Interface1 {
    void test();
}
