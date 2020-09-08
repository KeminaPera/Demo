package com.keminapera.spring.chapter2;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/8/18 下午10:47
 */
public class Test2 {
    @Test
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Object person1 = context.getBean("person");
        Object person2 = context.getBean("person");
        System.out.println("person1 == person2: " + (person1 == person2));
        System.out.println(person1.hashCode() + "=============" + person2.hashCode());
    }
}
