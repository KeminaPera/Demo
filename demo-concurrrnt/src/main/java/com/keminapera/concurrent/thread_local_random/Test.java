package com.keminapera.concurrent.thread_local_random;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/8/12 下午9:27
 */
public class Test {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(4);
        int i = atomicInteger.addAndGet(1);
        System.out.println(i);
        int andAdd = atomicInteger.getAndAdd(1);
        System.out.println(andAdd);
    }
}
