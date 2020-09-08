package com.keminapera.concurrent.wangwenjun.future;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/7/15 下午11:06
 */
public class AsycFuture<T> implements Future<T> {
    private T result;
    private volatile boolean done;

    public void call(T result) {
        synchronized (this) {
            this.result = result;
            done = true;
            this.notifyAll();
        }
    }
    @Override
    public T get() throws InterruptedException {
        while (!done) {
            synchronized (this) {
                this.wait();
            }
        }
        return result;
    }
}
