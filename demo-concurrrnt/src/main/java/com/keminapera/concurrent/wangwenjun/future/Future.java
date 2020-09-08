package com.keminapera.concurrent.wangwenjun.future;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/7/15 下午11:05
 */
public interface Future<T> {
    T get() throws InterruptedException;
}
