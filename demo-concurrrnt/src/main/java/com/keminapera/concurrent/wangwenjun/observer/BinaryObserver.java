package com.keminapera.concurrent.wangwenjun.observer;

public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println(Integer.toBinaryString(subject.getState()));
    }
}
