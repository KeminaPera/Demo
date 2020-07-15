package com.keminapera.concurrent.chapter4.section4_1.demo10_2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Demo1 {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public ReentrantLock getLock() {
        return lock;
    }
    public void sleep() {
        try {
            lock.lock();
            System.out.println(Thread.currentThread().getName() + "等待锁队列长度=" + lock.getQueueLength());
            try {
                Thread.sleep(Integer.MAX_VALUE);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }finally {
            lock.unlock();
        }
    }

    public void await() {
        try {
            try {
                lock.lock();
                condition.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }finally {
            lock.unlock();
        }
    }

    public void execute() {
        try {
            lock.lock();
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
