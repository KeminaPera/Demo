package com.keminapera.concurrent.wangwenjun.threadlocal;

import java.util.stream.IntStream;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/7/17 下午11:01
 */
public class ThreadLocal3 {


    public static void main(String[] args) {

        IntStream.range(0,5).forEach(a -> new Thread(() -> {

        }));

    }
}
