package com.keminapera.spring.chapter5;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.Lifecycle;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/8/23 上午9:25
 */
public class Dog implements Lifecycle, BeanNameAware {
    @Override
    public void start() {
        System.out.println("Dog start...");
    }

    @Override
    public void stop() {
        System.out.println("Dog stop...");
    }

    @Override
    public boolean isRunning() {
        System.out.println("Dog isRunning...");
        return false;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println(name);
    }
}
