package com.keminapera.concurrent.wangwenjun.threadlocal;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/7/17 下午10:10
 */
public class ThreadLocal2 {
    public static void main(String[] args) throws InterruptedException {
        //method();
        ThreadLocal<String> threadLocal = new ThreadLocal<>();
        threadLocal.set("hello world!");
        System.out.println(threadLocal.get());
        TimeUnit.SECONDS.sleep(3);
        System.out.println(threadLocal.get());
    }

    private static void method() {
        ThreadLocal<String> t2 = new ThreadLocal<>();
        Random random = new Random();
        IntStream.range(0, 5).forEach(a -> new Thread(() -> {
            t2.set(a + " " + random.nextInt(10));
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(t2.get());
        }).start());
    }
}
