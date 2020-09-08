package com.keminapera.concurrent.producerAndconsumer;

import java.util.LinkedList;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/7/29 下午9:07
 */
public class MessageQueue {
    private final LinkedList<Message> messageQueue;
    private final Object putLock = new Object();
    private final Object getLock = new Object();
    private final static int MAX_SIZE = 100;

    public MessageQueue() {
        this.messageQueue = new LinkedList<>();
    }

    public void put(Message message) throws InterruptedException {
        synchronized (messageQueue) {
            while (messageQueue.size() == MAX_SIZE) {
                messageQueue.wait();
            }
            messageQueue.addLast(message);
            messageQueue.notifyAll();
        }
    }

    public Message get() throws InterruptedException {
        synchronized (messageQueue) {
            while (messageQueue.size() == 0) {
                messageQueue.wait();
            }
            messageQueue.notifyAll();
            return messageQueue.removeFirst();
        }
    }

    public int getMessageCount() {
        synchronized (messageQueue) {
            return messageQueue.size();
        }
    }
}
