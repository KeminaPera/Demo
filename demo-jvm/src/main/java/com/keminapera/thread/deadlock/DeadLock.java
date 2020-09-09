package com.keminapera.thread.deadlock;

import java.util.stream.IntStream;

public class DeadLock {
    private static final Object resourceA = new Object();
    private static final Object resourceB = new Object();
    public static void main(String[] args) {
        Task task = new Task(resourceA, resourceB);
        IntStream.rangeClosed(0, 50).forEach(i -> {
            new Thread(task, "Thread-" + i).start();
        });
    }
}

class Task implements Runnable {

    private final Object resourceA;
    private final Object resourceB;
    public Task(Object resourceA, Object resourceB) {
        this.resourceA = resourceA;
        this.resourceB = resourceB;
    }
    @Override
    public void run() {
        synchronized (resourceA) {
            System.out.println(Thread.currentThread().getName() + " get resourceA...");
            try {
                Thread.sleep(3_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " waiting resourceB...");
            synchronized (resourceB) {
                System.out.println(Thread.currentThread().getName() + " get resourceB...");
            }
        }
    }
}
