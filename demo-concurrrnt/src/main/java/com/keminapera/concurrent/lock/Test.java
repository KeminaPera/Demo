package com.keminapera.concurrent.lock;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/7/26 下午11:26
 */
public class Test {
    /*public synchronized void method(){
        //do something
    }*/
    public static void method() {
        Object o = new Object();
        synchronized (o) {
            System.out.println("hello world!!!");
        }
    }
    /*public String append() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("hello");
        buffer.append(" world!");
        return buffer.toString();
    }*/
}
