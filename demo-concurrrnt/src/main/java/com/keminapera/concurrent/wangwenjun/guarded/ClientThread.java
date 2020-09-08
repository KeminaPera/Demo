package com.keminapera.concurrent.wangwenjun.guarded;

import com.sun.istack.internal.NotNull;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/7/16 下午10:46
 */
public class ClientThread extends Thread {
    private final RequestQueue queue;
    private final String content;

    public ClientThread(@NotNull RequestQueue queue, String content) {
        this.queue = queue;
        this.content = content;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            Request request = new Request(content);
            System.out.println("Client produce " + request.getContent());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            queue.putRequest(request);
        }
    }
}
