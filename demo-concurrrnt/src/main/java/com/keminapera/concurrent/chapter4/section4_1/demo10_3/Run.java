package com.keminapera.concurrent.chapter4.section4_1.demo10_3;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service();
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                service.await();
            }
        };

        for (int i = 0; i < 10; i++) {
            Thread t1 = new Thread(r1);
            t1.start();
        }

        Thread.sleep(3000);
        System.out.println();
        service.anotify();
        service.anotifyAll();
    }
}
