package com.keminapera.jvm.memory;

/**
 * 内存分配
 * 如果Minor GC过程中存活的对象比较多，在Survivor区放不下，会发生什么？
 *
 * @author KeminaPera
 * @date 2019/11/23 10:47
 */
public class MemoryAllocation3 {
    private static int _1MB = 1024 * 1024;
    private static int _500KB = 512 * 1024;

    /**
     * VM参数：-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:SurvivorRatio=8 -XX:+PrintGCDetails
     * @param args
     */
    public static void main(String[] args) {
        byte[] allocation1 = new byte[3 * _1MB];
        byte[] allocation2 = new byte[3 * _1MB];
        allocation1 = null;
        // 下面语句会触发MinorGC,回收掉allocationh1占用的空间，但由于allocation2对象还存活，Survivor区只有1024K，放不下allocation2对象，使用空间分配担保机制直接在老年代给allocation2分配空间
        byte[] allocation3 = new byte[_500KB];
    }
}
