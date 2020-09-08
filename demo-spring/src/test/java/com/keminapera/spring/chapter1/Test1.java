package com.keminapera.spring.chapter1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/8/18 下午10:01
 */
@Configuration
@ComponentScan(basePackages={"com.keminapera.spring"})
public class Test1 {
    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
        int beanDefinitionCount = context.getBeanDefinitionCount();
        System.out.println(beanDefinitionCount);
    }
}
