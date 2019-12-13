package com.keminapera.jvm.classload;

/**
 * 类加载--初始化过程
 *
 * @author KeminaPera
 * @date 2019/12/1 11:42
 */
public class Initialization {
    /**
     * FLAG在类加载过程的准备阶段已经初始化为flag了,由于是类的常量
     */
    public static final String FLAG = "flag";
    public static Integer count = 10;

    private int temp = 6;

    public Initialization() {
        System.out.println("显示创建的默认构造器执行了");
    }
    public Initialization(int number) {
        count++;
        System.out.println("实例化了一个Initialization对象" + "count = " + count);
        System.out.println("temp = " + temp);
        temp = number;
        System.out.println("通过构造器赋值后" + "temp = " + temp);
    }
    //类的初始化不会执行该语句块内的内容
    {
        count++;
        System.out.println("源文件中第一个语句块" + "count = " + count);
    }
    static {
        count++;
        System.out.println("源文件中第一个静态语句块！！！"+ "count =" + count);
    }
    //类的初数化不会执行该语句块内的内容
    {
        count ++;
        System.out.println("源文件中第二个语句块" + "count = " + count);
    }
    static {
        count++;
        System.out.println("源文件中第二个静态语句块！！！" + "count = " + count);
    }
}
