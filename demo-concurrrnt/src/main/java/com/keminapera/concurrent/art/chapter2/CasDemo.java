package com.keminapera.concurrent.art.chapter2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class CasDemo {
    public static void main(String[] args) throws InterruptedException {
        AtomicCounter counter = new AtomicCounter();
        List<Thread> threadList = new ArrayList<>(100);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            Thread t = new Thread() {
                @Override
                public void run() {
                    for (int j = 0; j < 100_000; j++) {
                        counter.safeCount();
                        counter.count();
                    }
                }
            };
            threadList.add(t);
            t.start();
        }
        for (Thread thread : threadList) {
            thread.join();
        }
        System.out.println("用时：" + (System.currentTimeMillis() - start));
        System.out.println(counter.atomic.get());
        System.out.println(counter.j);
    }
}

class AtomicCounter {
    public AtomicInteger atomic = new AtomicInteger(0);
    public volatile int j = 0;
    public void safeCount() {
        for (;;) {
            int i = atomic.get();
            boolean result = atomic.compareAndSet(i, ++i);
            if (result) {
                break;
            }
        }
    }

    public void count() {
        j++;
    }
}
