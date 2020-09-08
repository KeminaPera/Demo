package com.keminapera.concurrent.jol;

import org.openjdk.jol.info.ClassLayout;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/7/19 下午12:19
 */
public class JavaObjectHeader {
    public static void main(String[] args) {
        //新建的lock对象，不被任何线程持有
        /*System.out.println("调用hashCode方法前对象布局");
        System.out.println(ClassLayout.parseInstance(lock).toPrintable());
        System.out.println("锁对象的二进制hashCode="  + Integer.toBinaryString(lock.hashCode()));
        System.out.println("调用hashCode方法后对象布局");
        System.out.println(ClassLayout.parseInstance(lock).toPrintable());*/
        Thread thread = new Thread(() -> {
            Object lock = new Object();
            synchronized (lock) {
                System.out.println(Long.toBinaryString(Thread.currentThread().getId()));
                //这块htread线程已经持有lock锁，此时lock对象是偏向状态
                System.out.println(ClassLayout.parseInstance(lock).toPrintable());
            }
        });
        thread.start();
        /*synchronized (lock) {
            System.out.println(ClassLayout.parseInstance(lock).toPrintable());
        }*/
    }
}
