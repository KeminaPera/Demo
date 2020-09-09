package com.keminapera.thread.sleep;

public class SleepTest {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            System.out.println(Thread.currentThread() + "enter sleeping!");
            try {
                Thread.sleep(2000_000);
            } catch (InterruptedException e) {
                return;
            }
            System.out.println(Thread.currentThread() + "exit normally!!!");
        }, "myThread");
        t.start();


        Thread.sleep(3_000);

        t.interrupt();
    }
}
