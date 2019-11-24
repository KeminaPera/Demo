package com.keminapera.jvm.memory;

/**
 * 大对象直接进入老年代demo
 *
 * @author KeminaPera
 * @date 2019/11/23 13:38
 */
public class BigObject {
    private static final int _1MB = 1024 * 1024;
    /**
     * VM参数：-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:PretenureSizeThreshold=3145728
     * @param args
     */
    public static void main(String[] args) {
        byte[] bigObject = new byte[8 * _1MB];
    }
}
