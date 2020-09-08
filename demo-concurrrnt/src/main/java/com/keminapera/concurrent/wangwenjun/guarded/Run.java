package com.keminapera.concurrent.wangwenjun.guarded;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/7/16 下午10:52
 */
public class Run {
    public static void main(String[] args) {
        RequestQueue queue = new RequestQueue();
        ClientThread client = new ClientThread(queue, "Kemina");
        client.start();
        ServerThread server = new ServerThread(queue);
        server.start();
    }
}
