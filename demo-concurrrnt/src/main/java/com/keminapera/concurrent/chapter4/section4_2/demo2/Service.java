package com.keminapera.concurrent.chapter4.section4_2.demo2;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Service {
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    public void write() {
        try {
            lock.writeLock().lock();
            System.out.println(Thread.currentThread().getName()+ "获取到锁并开始执行...");
            Thread.sleep(10_000);
            System.out.println(Thread.currentThread().getName()+ "任务执行完毕即将释放锁...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.writeLock().unlock();
        }
    }
}
