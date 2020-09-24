package com.keminapera.spring.future;

import org.junit.Test;

import java.util.concurrent.*;

/**
 * @author KangPeng
 * @since
 */
public class FutureTest {
    ExecutorService executor = Executors.newSingleThreadExecutor();

    @Test
    public void test() {
        Future<Integer> future = executor.submit(() -> {
            System.out.println("=================");
            int result = 1 / 0;
            return result;
        });

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            System.out.println("----------------------");
            Integer result = future.get();
            System.out.println("----------------------");
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
