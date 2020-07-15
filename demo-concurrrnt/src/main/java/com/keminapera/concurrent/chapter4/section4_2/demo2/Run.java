package com.keminapera.concurrent.chapter4.section4_2.demo2;

public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        for (int i = 0; i < 3; i++) {
            new Thread("Thread-write-" + i){
                @Override
                public void run() {
                    super.run();
                    service.write();
                }
            }.start();
            System.out.println("主线程创建线程Thread-write-" + i + "并启动...");
        }
    }
}
