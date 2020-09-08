package com.keminapera.concurrent.threadpool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.IntStream;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/7/28 下午9:15
 */
public class ThreadPool {
    public static void main(String[] args) {
        LinkedBlockingQueue queue = new LinkedBlockingQueue(40);
        ExecutorService threadPool = new ThreadPoolExecutor(2,2,0, TimeUnit.MILLISECONDS, queue);
        List<Callable<String>> taskList = new ArrayList<>();
        IntStream.rangeClosed(0,5).forEach(
                i -> taskList.add(() -> {
            System.out.println("这是第" + i + "个任务！");
            try {
                Thread.sleep(1_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "第" + i + "个任务返回结果";
        }));
        try {
            String result = threadPool.invokeAny(taskList);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
