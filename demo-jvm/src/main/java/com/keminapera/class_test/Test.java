package com.keminapera.class_test;

import org.apache.commons.beanutils.PropertyUtils;

import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        User user = new User();
        user.setName("123");
        Object o = PropertyUtils.getProperty(user, "name1");
        System.out.println(o);
    }
}
