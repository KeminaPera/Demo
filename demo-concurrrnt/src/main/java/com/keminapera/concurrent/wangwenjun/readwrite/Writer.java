package com.keminapera.concurrent.wangwenjun.readwrite;

import java.util.Random;

public class Writer extends Thread {
    private ShareData data;
    public Writer(ShareData data) {
        this.data = data;
    }

    @Override
    public void run() {
        try {
            Random random = new Random(1000);
            int i = random.nextInt();
            data.write(String.valueOf(i));
        }catch (Exception e) {
            System.out.println("捕获并处理异常...");
            e.printStackTrace();
        }
    }
}
