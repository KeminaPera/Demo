package com.keminapera.concurrent.threadpool;

import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/8/16 下午10:04
 */
public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        Object o = new Object();
        Thread t1 = new Thread(() -> {
            synchronized (o) {
                try {
                    o.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();

        TimeUnit.SECONDS.sleep(4);

        t1.interrupt();
        System.out.println("sdfdsa");
        IntStream.rangeClosed(0,50).forEach(System.out::println);
    }
}
