package com.keminapera.threadpool;

import java.util.stream.IntStream;

/**
 * @author KangPeng
 * @since
 */
public class Client {
    public static void main(String[] args) throws InterruptedException {
        MyThreadPool threadPool = new MyThreadPool();
        IntStream.rangeClosed(0,10).forEach(i ->{
            threadPool.submit(() -> {
                System.out.println("这是第"+ i + "个任务！！！");
                try {
                    Thread.sleep(3_000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        });
        try {
            Thread.sleep(20_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("isShutdown=" + threadPool.isShutdown());
        threadPool.shutdown();
        System.out.println("执行了shutdown方法");
        System.out.println("isShutdown=" + threadPool.isShutdown());
        System.out.println("isTerminal=" + threadPool.isTerminal());
        System.out.println("============================================");
        Thread.sleep(5_000);
        //List<Runnable> runnables = threadPool.shutdownNow();
        System.out.println("执行了shutdownNow方法");
        //System.out.println("还有" + runnables.size() + "个任务没有执行");
        System.out.println("===========================================");
        System.out.println("isShutdown=" + threadPool.isShutdown());
        System.out.println("isTerminal=" + threadPool.isTerminal());
    }
}
