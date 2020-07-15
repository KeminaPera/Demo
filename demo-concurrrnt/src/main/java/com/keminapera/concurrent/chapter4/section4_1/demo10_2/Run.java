package com.keminapera.concurrent.chapter4.section4_1.demo10_2;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        final Demo1 demo1 = new Demo1();
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                demo1.sleep();
            }
        };
        Thread t1 = new Thread(r1, "Thread_sleep");
        t1.start();

        Thread.sleep(1000);

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                demo1.await();
            }
        };
        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread(r2, "Thread_await_" + i);
            thread.start();
        }

        Thread.sleep(3000);
        System.out.println("当前正在等待线程队列数：" + demo1.getLock().getQueueLength());
        Runnable r3 = new Runnable() {
            @Override
            public void run() {
                demo1.execute();
            }
        };
        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread(r3, "Thread_execute_" + 1);
            thread.start();
        }
        Thread.sleep(3000);
        System.out.println("当前正在等待线程队列数：" + demo1.getLock().getQueueLength());
    }
}
