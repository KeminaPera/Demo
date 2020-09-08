package com.keminapera.spring.chapter2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/8/18 下午10:45
 */
@Configuration
public class AppConfig {
    @Lazy
    @Bean
    public Person person(){
        Person person = new Person();
        return person;
    }
}
