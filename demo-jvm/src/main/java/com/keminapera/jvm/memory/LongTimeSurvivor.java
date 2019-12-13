package com.keminapera.jvm.memory;

/**
 * 内存分配
 * 长期存活的对象直接进入老年代--只要存活的对象age超过-XX:MaxTenuringThreshold=1（默认15）这个值就会将存活的对象直接放到老年代
 *
 * @author KeminaPera
 * @date 2019/11/23 14:23
 */
public class LongTimeSurvivor {
    private static final int _1MB = 1024 * 1024;
    /**
     * VM参数：-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:MaxTenuringThreshold=1 -XX:+PrintTenuringDistribution
     * @param args
     */
    public static void main(String[] args) {
        byte[] allocation1 = new byte[_1MB / 2];
        byte[] allocation2 = new byte[3 * _1MB];
        allocation2 = null;
        //发生第一次Minor GC,allocation1进入Survivor区age变为1,allocation2的内存区域被回收,给allocation3分配内存空间
        byte[] allocation3 = new byte[3 * _1MB];
        allocation3 = null;
        //byte[] allocation4 = new byte[_1MB / 2];
        //byte[] allocation5 = new byte[_1MB / 2];
        byte[] allocation6 = new byte[3 * _1MB];
        allocation6 = null;
        //发生第二次minor GC,allocation3和allocation6的内存空间被回收,allocation1的age变为2，此时-XX:MaxTenuringThreshold=1,所以allocation1进入老年代
        byte[] allocation7 = new byte[3 * _1MB];
    }
}
