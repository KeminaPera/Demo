package com.keminapera.concurrent.chapter4.section4_1.demo10_1;

import java.util.concurrent.locks.ReentrantLock;

public class Demo1 {

    private ReentrantLock lock = new ReentrantLock();

    public void method1() {
        try {
            lock.lock();
            System.out.println(Thread.currentThread().getName() + "    getHoldCount   " + lock.getHoldCount());
            method3();
        } finally {
            lock.unlock();
        }
    }

    public void method2() {
        System.out.println(Thread.currentThread().getName() + "    getHoldCount   " + lock.getHoldCount());
    }

    public void method3() {
        try {
            lock.lock();
            System.out.println(Thread.currentThread().getName() + "    getHoldCount   " + lock.getHoldCount());
        } finally {
            lock.unlock();
        }
    }
}
