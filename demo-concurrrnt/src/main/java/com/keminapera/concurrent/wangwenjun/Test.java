package com.keminapera.concurrent.wangwenjun;

public class Test {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        try {
            System.out.println("执行体...");
            int i = 1 / 0;
            System.out.println("异常抛出后执行部分...");
        }finally {
            System.out.println("finally块...");
        }
    }
}
