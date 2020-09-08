package com.keminapera.concurrent.producerAndconsumer;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/7/29 下午9:26
 */
public class Consumer extends Thread {
    private final MessageQueue queue;

    public Consumer(MessageQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Message message = queue.get();
                System.out.println("消费了消息" + message);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
