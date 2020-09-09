package com.keminapera.spring.cha2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    @org.junit.Test
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig2.class);
        Object person1 = context.getBean("person1");
        Object person2 = context.getBean("person2");
        System.out.println(person1 == person2);
        System.out.println("-------------------------------");
        Object person3 = context.getBean("person");
        Object person4 = context.getBean("person");
        System.out.println(person3 == person4);
    }
}
