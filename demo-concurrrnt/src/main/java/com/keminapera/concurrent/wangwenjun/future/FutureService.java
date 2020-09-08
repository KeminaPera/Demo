package com.keminapera.concurrent.wangwenjun.future;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/7/15 下午11:10
 */
public class FutureService<T> {
    public Future<T> submit(FutureTask<T> task) {
        AsycFuture future = new AsycFuture();
        new Thread() {
            @Override
            public void run() {
                T result = null;
                try {
                    result = task.start();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                future.call(result);
            }
        }.start();
        return future;
    }
}
