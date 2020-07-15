package com.keminapera.concurrent.wangwenjun.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Subject {
    private int state;
    private final List<Observer> observerList = new ArrayList<>();

    public void add(Observer observer) {
        Optional.ofNullable(observer).orElseThrow(NullPointerException::new);
        observerList.add(observer);
    }

    public void setState(int state) {
        if (this.state == state) {
            return;
        }
        this.state = state;
        notifyAllObserver();
    }

    public int getState() {
        return state;
    }

    public void notifyAllObserver() {
        observerList.forEach(Observer::update);
    }
}
