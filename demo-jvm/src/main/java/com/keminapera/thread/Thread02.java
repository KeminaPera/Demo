package com.keminapera.thread;

/**
 * TODO:该类的功能描述
 *
 * @author KeminaPera
 * @date 2020/2/25 23:09
 */
public class Thread02 {

    public  static void main(String[] args) {
        Thread[] threads = new Thread[100];
        for (int i =0 ; i < 100; i++) {
            threads[i] = new MyThread();
        }

        for (int i = 0; i < 100; i ++) {
            threads[i].start();
        }
    }
}

class MyThread extends Thread {
    private volatile static int count;
    private synchronized static void addCount() {
        for (int i = 0; i < 100; i++) {
            count++;
        }
        System.out.println(count);
    }


    @Override
    public void run() {
        super.run();
        addCount();
    }
}
