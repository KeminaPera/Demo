package com.keminapera.jvm.classload;

/**
 * 子类
 *
 * @author KeminaPera
 * @date 2019/12/1 16:56
 */
public class Son extends Parent {
    public static double money = 1200;
    static {
        System.out.println("子类静态构造块执行了！！！");
    }
}
