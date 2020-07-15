package com.keminapera.concurrent.art.chapter1;

public class DeadLockDemo {
    private final Object LOCK_A = new Object();
    private final Object LOCK_B = new Object();
    public void test1() {
        synchronized (LOCK_A) {
            System.out.println("持有LOCK_A锁，想要获取LOCK_B锁");
            synchronized (LOCK_B) {
                System.out.println("同时持有LOCK_A和LOCK_B");
            }
        }
    }

    public void test2() {
        synchronized (LOCK_B) {
            System.out.println("持有LOCK_B锁，想要获取LOCK_A");
            synchronized (LOCK_A) {
                System.out.println("同时持有LOCK_A和LOCK_B");
            }
        }
    }

    public static void main(String[] args) {
        DeadLockDemo demo = new DeadLockDemo();
        for (int i = 0; i < 100; i++) {
            new Thread("Thread_" + i){
                @Override
                public void run() {
                    demo.test1();
                }
            }.start();
        }
        while (true) {
            demo.test2();
        }
    }
}
