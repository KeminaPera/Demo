package com.keminapera.springmvc.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//@EnableWebMvc
@Configuration
@ComponentScan("com.keminapera.springmvc")
public class AppConfig {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Object internalResourceViewResolver = context.getBean("internalResourceViewResolver");
        System.out.println(internalResourceViewResolver);
    }

    @Bean
    public InternalResourceViewResolver internalResourceViewResolver () {
        return new InternalResourceViewResolver("/WEB-INF/", ".jsp");
    }
}
