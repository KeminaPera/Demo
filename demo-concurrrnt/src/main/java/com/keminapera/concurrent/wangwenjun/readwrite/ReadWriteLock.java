package com.keminapera.concurrent.wangwenjun.readwrite;

public class ReadWriteLock {
    private volatile int readingSize = 0;
    private int waiteReadSize = 0;
    private volatile int writingSize = 0;
    private int waiteWriteSize = 0;

    public synchronized void readLock() throws InterruptedException {
        try {
            waiteReadSize++;
            while (writingSize > 0) {
                this.wait();
            }
            System.out.println(Thread.currentThread().getName() + "获取了ReadLock...");
            readingSize++;
        } finally {
            waiteReadSize--;
        }
    }

    public synchronized void readUnlock() {
        System.out.println(Thread.currentThread().getName() + "释放了ReadLock...");
        readingSize--;
        notifyAll();
    }

    public synchronized void writeLock() throws InterruptedException {
        try {
            waiteWriteSize++;
            while (writingSize > 0 || readingSize > 0) {
                this.wait();
            }
            System.out.println(Thread.currentThread().getName() + "获取了WriteLock...");
            writingSize++;
        }finally {
            waiteWriteSize--;
        }
    }

    public synchronized void writeUnlock() {
        System.out.println(Thread.currentThread().getName() + "释放了WriteLock... ");
        writingSize--;
        notifyAll();
    }
}
