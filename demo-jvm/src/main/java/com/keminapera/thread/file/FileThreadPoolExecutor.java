package com.keminapera.thread.file;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class FileThreadPoolExecutor {
    private final int corePoolSize = 5;
    private final int maxPoolSize = 20;
    private final long keepAlivetime = 0;

    public ThreadPoolExecutor getThradPool() {
        return new ThreadPoolExecutor(corePoolSize, maxPoolSize, keepAlivetime, TimeUnit.MINUTES, new LinkedBlockingDeque<>(1000));
    }
}
