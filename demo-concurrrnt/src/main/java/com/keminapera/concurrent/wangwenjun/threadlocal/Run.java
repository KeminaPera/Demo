package com.keminapera.concurrent.wangwenjun.threadlocal;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/7/17 下午11:15
 */
public class Run {
    public static void main(String[] args) {
        ThreadId threadId = new ThreadId();
        for (int i = 0; i < 5; i++) {
            new MyThread(threadId).start();
        }
    }
}
