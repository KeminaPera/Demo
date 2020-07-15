package com.keminapera.concurrent.chapter4.section4_1.demo1;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest implements Runnable {
    private final ReentrantLock reentrantLock = new ReentrantLock();


    @Override
    public void run() {
        reentrantLock.lock();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "打印出结果" + i);
        }
        reentrantLock.unlock();
    }
}
