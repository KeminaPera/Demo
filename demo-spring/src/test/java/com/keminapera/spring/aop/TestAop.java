package com.keminapera.spring.aop;

import com.keminapera.spring.aop.service.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAop {
    @Test
    public void testAop() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        UserService bean = context.getBean(UserService.class);
        System.out.println(bean.desc());
    }
}
