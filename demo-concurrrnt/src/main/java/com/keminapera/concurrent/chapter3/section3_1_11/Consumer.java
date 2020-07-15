package com.keminapera.concurrent.chapter3.section3_1_11;

import java.util.List;

public class Consumer extends Thread {
    volatile List<Apple> appleList;

    public Consumer(List<Apple> appleList) {
        this.appleList = appleList;
    }

    @Override
    public void run() {
        synchronized (appleList) {
            if (appleList.size() == 0) {
                try {
                    appleList.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            super.run();
            System.out.println("消费者消费了一个苹果！！！");
            appleList.remove(0);
            appleList.notify();
        }
    }
}
