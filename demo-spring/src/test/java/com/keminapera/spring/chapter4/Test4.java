package com.keminapera.spring.chapter4;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/8/20 下午10:00
 */
public class Test4 {
    @Test
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig4.class);
        System.out.println("container has inited!!!");
        context.close();
    }
}
