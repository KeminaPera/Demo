package com.keminapera.spring.chapter4;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/8/20 下午9:57
 */
public class Pig {

    public Pig() {
        System.out.println("Pig Construtor");
    }

    @PostConstruct
    public void init() {
        System.out.println("init Pig ...");
    }

    @PreDestroy
    public void destory() {
        System.out.println("destory Pig...");
        System.out.println("haha");
    }
}
