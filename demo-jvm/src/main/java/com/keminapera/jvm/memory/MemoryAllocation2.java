package com.keminapera.jvm.memory;

/**
 * 内存分配
 * Minor GC干了那些事？
 *
 * @author KeminaPera
 * @date 2019/11/23 13:40
 */
public class MemoryAllocation2 {
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
        allocation2 = null;
        // 下面语句会触发MinorGC,回收掉allocationh1和allocation2占用的空间，将Eden区存活的对象复制到Survivor区，并给allocatio3对象分配内存
        byte[] allocation3 = new byte[_500KB];
    }
}
