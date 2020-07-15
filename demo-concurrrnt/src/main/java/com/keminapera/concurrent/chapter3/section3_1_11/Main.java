package com.keminapera.concurrent.chapter3.section3_1_11;

import java.util.ArrayList;
import java.util.List;

/**
 * 一生产者一消费者
 */
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 300; i++) {
            execute();
        }
    }

    private static void execute() {
        List<Apple> appleList = new ArrayList<>();
        Producer producer = new Producer(appleList);
        producer.start();

        Consumer consumer = new Consumer(appleList);
        consumer.start();
    }
}
