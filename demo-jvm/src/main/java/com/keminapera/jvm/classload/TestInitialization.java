package com.keminapera.jvm.classload;

/**
 * 类加载入口类
 *
 * @author KeminaPera
 * @date 2019/12/1 11:59
 */
public class TestInitialization {
    public static void main(String[] args) {
        System.out.println("------触发com.keminapera.jvm.classload.Initlize加载------");
        System.out.println(Initialization.FLAG);
        System.out.println("------加载com.keminapera.jvm.classload.Initlize完毕------");
        //让其输出类的变量
        System.out.println(Initialization.count);
        System.out.println("-----------------无参构造----------------");
        //通过无参构造器创建对象
        Initialization initialization1 = new Initialization();
        System.out.println("----------------有参构造-----------------");
        //通过有参构造器创建对象
        Initialization initialization2 = new Initialization(15);
    }
}
