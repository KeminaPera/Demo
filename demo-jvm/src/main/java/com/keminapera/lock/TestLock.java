package com.keminapera.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestLock {
    private static final Lock lock = new ReentrantLock();
    public static void main(String[] args) {
        lock.lock();
        try {

        }finally {
            lock.unlock();
        }
    }
}
