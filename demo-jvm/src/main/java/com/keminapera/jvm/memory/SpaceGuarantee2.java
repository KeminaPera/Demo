package com.keminapera.jvm.memory;

/**
 * 空间分配担保机制demo
 *
 * @author KeminaPera
 * @date 2019/11/23 21:53
 */
public class SpaceGuarantee2 {
    private static final int _1MB = 1024 * 1024;
    /**
     * VM参数：-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
     * @param args
     */
    public static void main(String[] args) {
        byte[] allocation1 = new byte[3 * _1MB];
        allocation1 = null;
        byte[] allocation2 = new byte[3 * _1MB];
        //第一次Minor GC,allocation2进入老年代,现在老年代被占用了3MB
        byte[] allocation3 = new byte[3 * _1MB];
        allocation3 = null;
        byte[] allocation4 = new byte[4 * _1MB];
        //第二次Minor GC,allocation4进入老年代,现在老年代被占用了7MB
        byte[] allocation5 = new byte[3 * _1MB];
        allocation5 = null;
        byte[] allocation6 = new byte[2 * _1MB];
        //下面这行注释掉结果会不同
        allocation4 = null;
        //第三次Minor GC,allocation
        byte[] allocation7 = new byte[3 * _1MB];
    }
}
