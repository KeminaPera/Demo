package com.keminapera.concurrent.wangwenjun.observer;

public class ObserverClient {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer binaryObserver = new BinaryObserver(subject);
        Observer octalObserver =  new OctalObserver(subject);
        subject.add(binaryObserver);
        subject.add(octalObserver);
        subject.setState(10);
    }
}
