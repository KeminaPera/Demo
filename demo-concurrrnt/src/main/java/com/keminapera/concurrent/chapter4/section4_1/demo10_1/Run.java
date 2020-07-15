package com.keminapera.concurrent.chapter4.section4_1.demo10_1;

public class Run {
    public static void main(String[] args) {
        final Demo1 demo1 = new Demo1();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                demo1.method1();
            }
        };
        Thread thread1 = new Thread(runnable);
        thread1.start();

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                demo1.method2();
            }
        };
        Thread thread2 = new Thread(runnable1);
        thread2.start();
    }
}
