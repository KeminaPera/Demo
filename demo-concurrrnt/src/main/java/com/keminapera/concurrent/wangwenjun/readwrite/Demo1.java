package com.keminapera.concurrent.wangwenjun.readwrite;

public class Demo1 {
    static abstract class Human {

    }

    static class Man extends Human {

    }

    static class Women extends Human {

    }

    public void sayHello(Human human) {
        System.out.println("hello human");
    }

    public void sayHello(Man man) {
        System.out.println("hello man");
    }

    public void sayHello(Women women) {
        System.out.println("hello women");
    }

    public static void main(String[] args) {
        Human man = new Man();
        Human women = new Women();
        Demo1 demo1 = new Demo1();
        demo1.sayHello(man);
        demo1.sayHello(women);
    }
}
