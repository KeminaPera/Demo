package com.keminapera.thread.interrupt;

public class InterruptTest {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
           while (true) {
           }
        });
        t.start();
        Thread.sleep(1_000);

        t.interrupt();
        System.out.println("Thread.interrupted: " + t.interrupted());
        System.out.println("isInterrupted: " + t.isInterrupted());
        System.out.println("isInterrupted: " + t.isInterrupted());
        System.out.println("Thread.interrupted: " + Thread.interrupted());
    }
}
