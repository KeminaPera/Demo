package com.keminapera.concurrent.chapter4.section4_1.demo2;

public class ThreadA extends Thread {
    private final MyService service;

    public ThreadA(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.methodA();
    }
}
