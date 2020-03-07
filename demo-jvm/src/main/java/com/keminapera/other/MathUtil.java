package com.keminapera.other;

/**
 * TODO:该类的功能描述
 *
 * @author KeminaPera
 * @date 2020/2/26 23:30
 */
public class MathUtil {
    static int add(int x, int y) {
        System.out.println("这是MathUtil的add方法...");
        return x + y;
    }

    static int reduce(int x, int y) {
        return x - y;
    }

    void print() {
        System.out.println("这是非静态方法...");
    }
}
