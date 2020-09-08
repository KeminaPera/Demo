package com.keminapera.concurrent.producerAndconsumer;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/7/29 下午9:16
 */
public class Producer extends Thread {
    private final MessageQueue queue;
    private static AtomicInteger counter = new AtomicInteger();

    public Producer(MessageQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            Message message = new Message("message-" + counter.getAndIncrement());
            try {
                System.out.println("生产了消息message-");
                queue.put(message);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
