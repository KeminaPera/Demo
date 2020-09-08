package com.keminapera.concurrent.wangwenjun.threadlocal.test;

import java.util.stream.IntStream;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/7/21 下午10:54
 */
public class Run {
    public static void main(String[] args) {
        IntStream.range(0,5).forEach(i -> new Thread(new Task()).start());
    }
}
