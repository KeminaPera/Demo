package com.keminapera.concurrent.wangwenjun.guarded;

import java.util.LinkedList;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/7/16 下午10:33
 */
public class RequestQueue {

    private LinkedList<Request> queue = new LinkedList();

    public Request getRequest() {
        synchronized (queue) {
            while (queue.size() <= 0) {
                try {
                    queue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        return queue.removeFirst();
    }

    public void putRequest(Request request) {
        synchronized (queue) {
            queue.addLast(request);
            queue.notifyAll();
        }
    }
}
