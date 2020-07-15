package com.keminapera.concurrent.chapter4.section4_2.demo1;

public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        for (int i = 0; i < 3; i++) {
            new Thread("Thread-read-" + i) {
                @Override
                public void run() {
                    super.run();
                    service.read();
                }
            }.start();
            System.out.println("主线程创建Thread-read-" + i + "线程并启动...");
        }
    }
}
