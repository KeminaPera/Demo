package com.keminapera.jvm.memory;

/**
 * 内存分配
 * 优先在新生代Eden区分配
 *
 * @author KeminaPera
 * @date 2019/11/23 13:43
 */
public class MemoryAllocation1 {
    private static int _1MB = 1024 * 1024;

    /**
     * VM参数：-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:SurvivorRatio=8 -XX:+PrintGCDetails
     * @param args
     */
    public static void main(String[] args) {
        byte[] allocation1 = new byte[3 * _1MB];
        byte[] allocation2 = new byte[3 * _1MB];
    }
}
