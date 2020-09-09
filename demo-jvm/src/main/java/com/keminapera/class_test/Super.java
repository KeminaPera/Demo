package com.keminapera.class_test;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class Super<T> {

    T value;

    Class<?> entityClass = getClass();

    public String desc() {
        return entityClass.getName();
    }

    public Class<?> getGenericType() {
        Type genType = getClass().getGenericSuperclass();
        System.out.println(genType instanceof ParameterizedType);
        Type[] types = ((ParameterizedType) genType).getActualTypeArguments();
        return (Class<?>)types[0];
    }
}
