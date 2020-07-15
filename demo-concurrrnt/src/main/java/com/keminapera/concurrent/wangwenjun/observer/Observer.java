package com.keminapera.concurrent.wangwenjun.observer;

public abstract class Observer {
    protected final Subject subject;
    public Observer(Subject subject) {
        this.subject = subject;
    }

    public abstract void update();
}
