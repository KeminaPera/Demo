package com.keminapera.concurrent.test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/7/30 下午10:46
 */
public class TestFutureTask {
    public static void main(String[] args) {
        FutureTask<String> task = new FutureTask(() -> {
            System.out.println("开始执行任务！");
            Thread.sleep(10_000);
            System.out.println("是否执行到这里了");
            return "hello world!!!";
        });
        Thread thread = new Thread(task);
        thread.start();
        try {
            Thread.sleep(3_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        task.cancel(true);
        System.out.println(task.isCancelled());
        try {
            System.out.println(task.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
