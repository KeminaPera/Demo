package com.keminapera.concurrent.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/7/22 下午10:54
 */
public class LockApiTest {
    public static void main(String[] args) throws InterruptedException {
        ReentrantLock lock = new ReentrantLock();
        Thread holdLock = new Thread() {
            @Override
            public void run() {
                lock.lock();
                try {
                    System.out.println(Thread.currentThread().getName() + "locked!!!");
                    Thread.sleep(30_000);
                }catch (Exception e) {
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }
            }
        };
        holdLock.setName("hold_thread");
        holdLock.start();

        Thread wantThread = new Thread() {
            @Override
            public void run() {
                try {
                    lock.lockInterruptibly();
                    System.out.println(Thread.currentThread().getName() + "locked!!!");
                }catch (Exception e) {

                }finally {
                    lock.unlock();
                }
            }
        };
        wantThread.setName("want-thread");
        wantThread.start();
        Thread.sleep(5_000);
        wantThread.interrupt();
    }
}
