package com.keminapera.concurrent.chapter4.section4_1.demo1;

public class Run {
    public static void main(String[] args) {
        ReentrantLockTest test = new ReentrantLockTest();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(test);
            thread.setName("Thread-" + (i + 1));
            thread.start();
        }
    }
}
