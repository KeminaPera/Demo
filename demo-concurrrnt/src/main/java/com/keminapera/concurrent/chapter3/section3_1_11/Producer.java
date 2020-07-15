package com.keminapera.concurrent.chapter3.section3_1_11;

import java.util.List;

public class Producer extends Thread {
    volatile List<Apple> appleList;
    public Producer(List<Apple> appleList) {
        this.appleList = appleList;
    }

    @Override
    public void run() {
        synchronized (appleList) {
            if (appleList.size() == 1) {
                try {
                    appleList.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            super.run();
            System.out.println("生产者生产了一个苹果！！！");
            appleList.add(new Apple());
            appleList.notify();
        }
    }
}
