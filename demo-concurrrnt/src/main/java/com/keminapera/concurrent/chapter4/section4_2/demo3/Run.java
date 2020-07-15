package com.keminapera.concurrent.chapter4.section4_2.demo3;

public class Run {
    public static void main(String[] args) {
        Service service = new Service();

        for (int i = 0; i < 4; i++) {
            new Thread("Thread-read-" + i) {
                @Override
                public void run() {
                    super.run();
                    service.read();
                }
            }.start();
            System.out.println("            主线程创建了Thread-read-" + i + "线程并启动！！！");
        }

        new Thread("Thread-write"){
            @Override
            public void run() {
                super.run();
                service.write();
            }
        }.start();
        System.out.println("            主线程创建了Thread-write线程并启动！！！");

        for (int i = 0; i < 3; i++) {
            new Thread("thread-read-" + (4+i)) {
                @Override
                public void run() {
                    super.run();
                    service.read();
                }
            }.start();
            System.out.println("            主线程创建了thread-read-" + (4+i) + "线程并启动！！！");
        }
    }
}
