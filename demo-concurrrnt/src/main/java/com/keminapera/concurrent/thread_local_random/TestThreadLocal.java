package com.keminapera.concurrent.thread_local_random;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/8/13 下午10:16
 */
public class TestThreadLocal {
    private static  final ThreadLocal<String> INHERITABLE_THREAD_LOCAL = new InheritableThreadLocal<>();
    private static final ThreadLocal<String> THREAD_LOCAL = new ThreadLocal<>();
    public static void main(String[] args) {
        INHERITABLE_THREAD_LOCAL.set("hello world!");
        THREAD_LOCAL.set("Kemina");
        System.out.println("INHERITABLE_THREAD_LOCAL  ==  " + INHERITABLE_THREAD_LOCAL.get());
        System.out.println("THREAD_LOCAL  --  " + THREAD_LOCAL.get());
        new Thread(() -> {
            System.out.println("INHERITABLE_THREAD_LOCAL  ==  " + INHERITABLE_THREAD_LOCAL.get());
            System.out.println("THREAD_LOCAL  --  " + THREAD_LOCAL.get());
        }).start();
    }
}
