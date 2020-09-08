package com.keminapera.concurrent;

import java.lang.ref.WeakReference;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/8/10 上午8:47
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        String s = new String("123");
        WeakReference reference = new WeakReference(s);
        System.out.println(reference.get());
        s = null;
        System.gc();
        Thread.sleep(3_000);
        System.out.println(reference.get());
    }
}
