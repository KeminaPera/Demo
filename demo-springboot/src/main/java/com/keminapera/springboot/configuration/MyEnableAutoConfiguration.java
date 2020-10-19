package com.keminapera.springboot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author keminapera
 * @date 2020/10/1
 */
@Configuration(proxyBeanMethods = false)
public class MyEnableAutoConfiguration {
    @Bean
    public Dog dog() {
        return new Dog();
    }
}
class Dog{}
