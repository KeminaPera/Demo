package com.keminapera.concurrent.wangwenjun.guarded;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/7/16 下午10:48
 */
public class ServerThread extends Thread {
    private final RequestQueue queue;

    public ServerThread(RequestQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            Request request = queue.getRequest();
            System.out.println("Server consumer " + request.getContent());
        }
    }
}
