package com.keminapera.spring.cha2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.keminapera.spring.cha2")
public class AppConfig2 {
    @Bean("person1")
    public Person getPerson1() {
        return new Person();
    }
    @Bean("person2")
    public Person getPerson2() {
        return new Person();
    }
}
