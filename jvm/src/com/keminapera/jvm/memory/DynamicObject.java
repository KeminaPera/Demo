package com.keminapera.jvm.memory;

/**
 * 动态对象年龄判断--相同年龄所有对象大小总和大于Survivor空间的一半，就可以直接进老年代
 *
 * @author KeminaPera
 * @date 2019/11/23 21:11
 */
public class DynamicObject {
    private static final int _1MB = 1024 * 1024;
    /**
     * VM参数：-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:MaxTenuringThreshold=3 -XX:+PrintTenuringDistribution
     * @param args
     */
    public static void main(String[] args) {
        byte[] allocation1 = new byte[_1MB / 4 + 50];
        byte[] allocation2 = new byte[_1MB / 4 + 50];
        byte[] allocation3 = new byte[4 * _1MB];
        allocation3 = null;
        //发生第一次Minor GC,allocation1和allocation2进入Survivor区age变为1,allocation2的内存区域被回收,给allocation3分配内存空间
        byte[] allocation4 = new byte[3 * _1MB];
        allocation4 = null;
        //byte[] allocation5 = new byte[_1MB / 2];
        byte[] allocation6 = new byte[3 * _1MB];
        allocation6 = null;
        //发生第二次minor GC,allocation3和allocation6的内存空间被回收,allocation1的age变为2，此时-XX:MaxTenuringThreshold=1,所以allocation1进入老年代
        byte[] allocation7 = new byte[3 * _1MB];
        allocation7 = null;
        allocation6 = new byte[3 * _1MB];
        allocation6 = null;
        allocation4 = new byte[3 * _1MB];
    }
}
