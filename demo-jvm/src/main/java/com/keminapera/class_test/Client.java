package com.keminapera.class_test;

public class Client {
    public static void main(String[] args) {
        Sub sub = new Sub<String>();
        System.out.println(sub.getGenericType().getName());
        System.out.println(sub.desc());
    }
}
