package com.keminapera.concurrent.wangwenjun.threadlocal;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/7/17 下午11:12
 */
public class ThreadId {
    public static AtomicInteger nextId = new AtomicInteger(0);
    ThreadLocal<Integer> threadLocal = new ThreadLocal(){
        @Override
        protected Object initialValue() {
            return nextId.getAndIncrement();
        }
    };

    public int get() {
        return threadLocal.get();
    }
}
