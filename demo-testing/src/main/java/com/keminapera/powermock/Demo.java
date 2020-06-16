package com.keminapera.powermock;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/6/13 下午7:27
 */
public class Demo {
    public int add(int one, int other) {
        return one + other;
    }

    //编写临时方法进行验证
    public static void main(String[] args) {
        Demo demo = new Demo();
        int sum = demo.add(2, 3);
        //查看输出结果
        System.out.println(sum);
    }
}
