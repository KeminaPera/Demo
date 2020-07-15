package com.keminapera.concurrent.chapter3.section317;

public class WaitLong {
    public static void main(String[] args) throws InterruptedException {
        Thread1 thread1 = new Thread1();
        thread1.setName("Thread-1");
        thread1.start();
        Thread.sleep(3000);
        synchronized (thread1) {
            thread1.notify();
        }
    }
}

class Thread1 extends Thread {

    @Override
    public void run() {
        super.run();
        synchronized (this) {
            try {
                System.out.println(System.currentTimeMillis() + " " +Thread.currentThread().getName() + "进入wait方法");
                this.wait(10_000);
                System.out.println(System.currentTimeMillis() + " " +Thread.currentThread().getName() +  "自己有重新启动了");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
