package com.keminapera.concurrent.wangwenjun;

import java.util.ArrayList;
import java.util.List;

public class ImmutableTest {
    public static void main(String[] args) throws InterruptedException {

        long startTimestamp = System.currentTimeMillis();
        List<Thread> threadList = new ArrayList<>();
        //6384
        //Immutable immutable = new Immutable(new ArrayList<>());
        //19087
        Mutable mutable = new Mutable(new ArrayList<>());
        for (int i = 0; i < 3; i++) {
            Thread t = new Thread() {
                @Override
                public void run() {
                    for (int i = 0; i < 100; i++) {
                        try {
                            System.out.println(Thread.currentThread().getName() + mutable.getSize());
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            };
            threadList.add(t);
            t.start();
        }
        for (Thread thread : threadList) {
            thread.join();
        }

        System.out.println("消耗了：" + (System.currentTimeMillis() - startTimestamp));
    }
}

class Immutable {
    private final List<String> nameList;

    Immutable(List<String> nameList) {
        this.nameList = new ArrayList<>();
        nameList.addAll(nameList);
    }

    public int getSize() throws InterruptedException {
        Thread.sleep(50);
        return nameList.size();
    }
}

class Mutable{
    private List<String> nameList;

    Mutable(List<String> nameList) {
        this.nameList = nameList;
    }

    public synchronized int getSize() throws InterruptedException {
        Thread.sleep(50);
        return nameList.size();
    }
}


