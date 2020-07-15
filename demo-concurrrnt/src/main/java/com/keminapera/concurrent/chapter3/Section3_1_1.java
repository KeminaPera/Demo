package com.keminapera.concurrent.chapter3;

import java.util.ArrayList;
import java.util.List;

public class Section3_1_1 {
    public static void main(String[] args) throws InterruptedException {
        Task task = new Task();
        Thread1 thread1 = new Thread1(task);
        thread1.setName("Thread-1");
        thread1.start();
        Thread.sleep(3000);
        Thread2 thread2 = new Thread2(task);
        thread2.setName("Thread-2");
        thread2.start();
    }
}

class Task extends Thread {
    private List<String> list = new ArrayList<>();

    public synchronized void add() {
        list.add("hello worls");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "添加了一条数据");
    }

    public int size() {
        return list.size();
    }
}

class Thread1 extends Thread {
    private final Task task;

    public Thread1(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        while (true) {
            if (task.size() > 5) {
                synchronized (task) {
                    try {
                        System.out.println(Thread.currentThread().getName() + "进入wait状态");
                        task.wait();
                        System.out.println(Thread.currentThread().getName() + "离开wait状态");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            task.add();
        }
    }
}

class Thread2 extends Thread {
    private final Task task;
    public Thread2(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        while (true) {
            if (task.size() > 20) {
                synchronized (task) {
                    System.out.println(Thread.currentThread().getName() + "notify一个线程");
                    task.notify();
                    System.out.println(Thread.currentThread().getName() + "睡眠5秒");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "睡眠结束");
                }
            }
            task.add();
        }
    }
}
