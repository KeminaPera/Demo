package com.keminapera.spring.chapter4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/8/20 下午9:56
 */
@Configuration
@ComponentScan("com.keminapera.spring.chapter4")
public class AppConfig4 {

    //@Bean(initMethod = "init", destroyMethod = "destory")
    @Bean
    public Pig pig() {
        return new Pig();
    }
}
