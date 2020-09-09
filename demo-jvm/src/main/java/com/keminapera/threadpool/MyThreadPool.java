package com.keminapera.threadpool;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author KangPeng
 * @since
 */
public class MyThreadPool {
    private ExecutorService myThreadPool = Executors.newFixedThreadPool(2);
    public void submit(Runnable task) {
        myThreadPool.submit(task);
    }

    public void shutdown() {
        myThreadPool.shutdown();
    }

    public List<Runnable> shutdownNow() {
        return myThreadPool.shutdownNow();
    }
    public boolean isShutdown() {
        return myThreadPool.isShutdown();
    }

    public boolean isTerminal() {
        return myThreadPool.isTerminated();
    }
}
