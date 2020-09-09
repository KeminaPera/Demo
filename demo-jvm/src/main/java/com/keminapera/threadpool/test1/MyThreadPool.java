package com.keminapera.threadpool.test1;

import java.util.concurrent.*;
import java.util.stream.IntStream;

/**
 * @author KangPeng
 * @since
 */
public class MyThreadPool {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(10);
        IntStream.rangeClosed(0,50).forEach(i -> {
            Callable<Object> callable = Executors.callable(() -> {
                System.out.println("这是第" + i + "个任务");
                try {
                    Thread.sleep(1_000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            Future<Object> future = threadPool.submit(callable);
        });
        IntStream.rangeClosed(0,50).forEach(System.out::print);
    }
}
