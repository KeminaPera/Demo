package com.keminapera.concurrent.chapter4.section4_1.demo2;

public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();
        for (int i = 0; i < 3; i++) {
            ThreadA threadA = new ThreadA(service);
            threadA.setName("ThreadA-" + i);
            ThreadB threadB = new ThreadB(service);
            threadB.setName("ThreadB-" + i);
            threadA.start();
            threadB.start();
        }
    }
}
