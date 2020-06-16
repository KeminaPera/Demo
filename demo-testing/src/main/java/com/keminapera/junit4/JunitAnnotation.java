package com.keminapera.junit4;

import java.util.Date;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/6/14 下午3:51
 */
public class JunitAnnotation {
    public void say() {
        System.out.println("如有问题，欢迎及时指正！！！");
    }

    public void hello() {
        System.out.println("开启我们单元测试之旅...");
    }

    public void print() {
        System.out.println("上班写BUG，加班改BUG");
    }

    public static void main(String[] args) {
        Date date = new Date(System.currentTimeMillis());
        java.sql.Date date1 = new java.sql.Date(date.getTime());
    }
}
