package com.keminapera.concurrent.wangwenjun.observer1;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        SubObserverListener listener = new SubObserverListener();
        listener.execute(Arrays.asList("1", "2", "3"));
    }
}
