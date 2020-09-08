package com.keminapera.concurrent.wangwenjun.threadlocal;

import java.util.HashMap;
import java.util.Map;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/7/21 下午9:54
 */
public class MyThreadLocal<T> {
    private final Map<Thread, T> map =  new HashMap<>();
    public void set(T t) {
        synchronized (this) {
            Thread currentThread = Thread.currentThread();
            map.put(currentThread, t);
        }
    }

    public T get() {
        synchronized (this) {
            Thread currentThread = Thread.currentThread();
            T t = map.get(currentThread);
            if (t == null) {
                return initValue();
            }
            return t;
        }
    }

    private T initValue() {
        return null;
    }

    public static void main(String[] args) throws InterruptedException {
        MyThreadLocal<String> threadLocal = new MyThreadLocal<>();
        new Thread(() -> {
            threadLocal.set("Thread-1");
            try {
                Thread.sleep(1_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " +threadLocal.get());
        }).start();

        new Thread(() -> {
            threadLocal.set("Thread-2");
            try {
                Thread.sleep(1_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + threadLocal.get());
        }).start();
        threadLocal.set("Main");
        Thread.sleep(1_000);
        System.out.println(Thread.currentThread().getName() + "   " + threadLocal.get());
    }
}
