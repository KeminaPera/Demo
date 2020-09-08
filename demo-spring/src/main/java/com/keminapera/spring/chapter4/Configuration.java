package com.keminapera.spring.chapter4;

import org.springframework.context.annotation.Bean;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/8/20 下午10:07
 */
public class Configuration {
    @Bean(initMethod = "init", destroyMethod = "destory")
    public Pig pig() {
        return new Pig();
    }
}
