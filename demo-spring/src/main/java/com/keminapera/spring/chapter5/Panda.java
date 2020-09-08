package com.keminapera.spring.chapter5;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/8/23 上午10:14
 */
public class Panda extends Animal {
    private Integer age;

    public Panda(String name, Integer age) {
        super(name);
        this.age = age;
    }

    @Override
    public String toString() {
        return "[name=" + getName() + ", age=" + age +"]";
    }
}
