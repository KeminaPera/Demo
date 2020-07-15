package com.keminapera.concurrent.wangwenjun.readwrite;

public class Reader extends Thread {
    private ShareData data;

    public Reader(ShareData data) {
        this.data = data;
    }

    @Override
    public void run() {
        try {
            String read = data.read();
            System.out.println(read);
        }catch (Exception e) {
            System.out.println("捕获并处理异常...");
            e.printStackTrace();
        }
    }
}
