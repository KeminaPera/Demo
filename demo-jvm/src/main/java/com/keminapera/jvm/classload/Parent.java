package com.keminapera.jvm.classload;

/**
 * 父类
 *
 * @author KeminaPera
 * @date 2019/12/1 16:54
 */
public class Parent {
    public static String name;
    public static int age;
    static{
        name = "zhangsansan";
        age = 18;
        System.out.println("父类构造块执行了！！！");
    }
}
