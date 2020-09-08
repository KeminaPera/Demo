package com.keminapera.concurrent.signal_and_await;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/8/15 上午10:27
 */
public class Test1 {
    private static final ReentrantLock LOCK = new ReentrantLock();
    private static final Condition CONDITION = LOCK.newCondition();
    public static void main(String[] args) throws InterruptedException {

        new Thread(() -> {
            LOCK.lock();
            try {
                System.out.println(Thread.currentThread().getName() + "already get lock");
                try {
                    CONDITION.await();
                    System.out.println(Thread.currentThread().getName() + "signaled");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }finally {
                LOCK.unlock();
                System.out.println(Thread.currentThread().getName() + "already unlock");
            }
        }).start();


        Thread.sleep(3_000);

        LOCK.lock();
        try {
            System.out.println(Thread.currentThread().getName() + "already get lock");
            CONDITION.signal();
        }finally {
            LOCK.unlock();
            System.out.println(Thread.currentThread().getName() + "already unlock");
        }
    }
}
