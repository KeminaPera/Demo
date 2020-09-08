package com.keminapera.concurrent.wangwenjun.threadlocal;

import java.lang.ref.WeakReference;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/7/17 下午11:45
 */
public class ThreadLocal$ {
    public static void main(String[] args) throws InterruptedException {
        ThreadLocal<User> threadLocal = new ThreadLocal<>();
        WeakReference reference = new WeakReference(new User("zhangsansan", 23));
        System.out.println(reference.get());
        Thread.sleep(1_000);
        System.out.println(reference.get());
        System.gc();
        System.out.println(reference.get());
    }


}