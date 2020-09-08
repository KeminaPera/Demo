package com.keminapera.concurrent.threadpool;

import java.util.concurrent.*;
import java.util.stream.IntStream;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/7/28 下午9:44
 */
public class Test1 {
    public static void main(String[] args) {
        LinkedBlockingQueue queue = new LinkedBlockingQueue(50);
        ExecutorService threadPool = new ThreadPoolExecutor(1, 5, 3, TimeUnit.SECONDS, queue);
        IntStream.rangeClosed(0,1).forEach(i -> {
            Future<String> result = threadPool.submit(() -> {
                Thread.sleep(4_000);
                return "hello world!";
            });
            System.out.println("第"+ i +"个任务返回的结果isCancelled=" + result.isCancelled());

            System.out.println("第"+ i + "个任务返回结果isDone=" + result.isDone());
            if (i == 1) {
                result.cancel(true);
            }
            System.out.println("第"+ i +"个任务返回的结果isCancelled=" + result.isCancelled());

            System.out.println("第"+ i + "个任务返回结果isDone=" + result.isDone());
            try {
                System.out.println("第" + i + "个任务返回的结果为=" + result.get());
                System.out.println("第"+ i + "个任务返回结果isDone=" + result.isDone());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });
    }
}
