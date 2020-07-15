package com.keminapera.concurrent.chapter4.section4_1.demo2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private final Lock lock = new ReentrantLock();

    public void methodA() {
        try {
            lock.lock();
            System.out.println(Thread.currentThread().getName() + " execute methodA begin....");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() + " execute methodA end....");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void methodB() {
        try {
            lock.lock();
            System.out.println(Thread.currentThread().getName() + " execute methodB begin...|");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() + " execute methodB end...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
