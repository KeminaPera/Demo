package com.keminapera.spring.chapter5;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/8/23 上午9:45
 */
@Component
public class Pig implements BeanNameAware {
    public Pig() {
        System.out.println("执行构造....");
    }
    @Override
    public void setBeanName(String name) {
        System.out.println(name);
        name = "pig1";
        System.out.println(name);
    }

    @PostConstruct
    public void init() {
        System.out.println("init................");
    }
}
