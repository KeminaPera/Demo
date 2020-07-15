package com.keminapera.concurrent.chapter4.section4_1.demo10_3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service {
    private ReentrantLock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    public void await() {
        try {
            lock.lock();
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void anotify() {
        try {
            lock.lock();
            System.out.println("在某条件下等待队列长度" + lock.getWaitQueueLength(condition));
            System.out.println("等待锁队列长度" + lock.getQueueLength());
            condition.signal();
            System.out.println("在某条件下等待队列长度" + lock.getWaitQueueLength(condition));
            System.out.println("等待锁队列长度" + lock.getQueueLength());
        }finally {
            lock.unlock();
        }
    }

    public void anotifyAll() {
        try {
            lock.lock();
            System.out.println("等待队列长度" + lock.getWaitQueueLength(condition));
            System.out.println("等待锁队列长度" + lock.getQueueLength());
            condition.signalAll();
            System.out.println("等待队列长度" + lock.getWaitQueueLength(condition));
            System.out.println("等待锁队列长度" + lock.getQueueLength());
        }finally {
            lock.unlock();
        }
    }
}
