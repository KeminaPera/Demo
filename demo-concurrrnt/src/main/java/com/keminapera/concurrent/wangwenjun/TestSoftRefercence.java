package com.keminapera.concurrent.wangwenjun;

import java.lang.ref.SoftReference;

public class TestSoftRefercence {
    public static void main(String[] args) throws InterruptedException {
        SoftReference reference = new SoftReference(new byte[1024 * 1024 * 10]);
        System.out.println(reference.get().hashCode());
        System.gc();
        Thread.sleep(4000);
        System.out.println(reference.get().hashCode());
        byte[] newArray = new byte[1024 * 1024 *10];
        System.out.println(reference.get());
    }

}
