package com.keminapera.concurrent.wangwenjun.threadlocal;

import java.util.concurrent.TimeUnit;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/7/17 下午11:13
 */
public class MyThread extends Thread {
    private final ThreadId threadId;

    public MyThread(ThreadId threadId) {
        this.threadId = threadId;
    }

    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread name is " + Thread.currentThread().getName() + "ThreadId is" + threadId.get());
    }
}
