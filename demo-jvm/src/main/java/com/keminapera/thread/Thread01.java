package com.keminapera.thread;

import lombok.SneakyThrows;

/**
 * TODO:该类的功能描述
 *
 * @author KeminaPera
 * @date 2020/2/25 22:18
 */
public class Thread01 {
    public static void main(String[] args) throws InterruptedException {
        PrintString runnable = new PrintString();
        new Thread(runnable).start();
        Thread.sleep(1000);
        runnable.setContinuePrint(false);
    }
}

class PrintString implements Runnable {
    private boolean isContinuePrint = true;

    public boolean getIsContinuePrint() {
        return isContinuePrint;
    }

    public void setContinuePrint(boolean isContinuePrint) {
        System.out.println(Thread.currentThread().getName() + "修改isContinuePrint的值为" + isContinuePrint);
        this.isContinuePrint = isContinuePrint;
    }

    public void continuePrint() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + "进入continuePrint方法");
        while (isContinuePrint) {
            System.out.println("正在运行的线程" + Thread.currentThread().getName());
        }
    }

    @SneakyThrows
    @Override
    public void run() {
        continuePrint();
    }
}
