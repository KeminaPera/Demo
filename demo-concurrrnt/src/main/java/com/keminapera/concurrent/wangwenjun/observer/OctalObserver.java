package com.keminapera.concurrent.wangwenjun.observer;

public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println(Integer.toOctalString(subject.getState()));
    }
}
