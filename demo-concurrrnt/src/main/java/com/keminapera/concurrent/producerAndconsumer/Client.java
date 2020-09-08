package com.keminapera.concurrent.producerAndconsumer;

import java.util.stream.IntStream;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/7/29 下午9:28
 */
public class Client {
    public static void main(String[] args) {
        MessageQueue queue = new MessageQueue();
        IntStream.rangeClosed(0, 10).forEach(i -> new Producer(queue).start());
        IntStream.rangeClosed(0,10).forEach(i -> new Consumer(queue).start());
    }
}
