package com.keminapera.springboot.configuration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertSame;

/**
 * @author keminapera
 * @date 2020/10/1
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = MyEnableAutoConfiguration.class)
public class MyEnableAutoConfigurationTest {
    @Autowired
    ApplicationContext context;

    @Test
    public void test01() {
        MyEnableAutoConfiguration configuration = context.getBean(MyEnableAutoConfiguration.class);
        Dog dog = configuration.dog();  //直接调用配置类bean的方法获取Dog对象
        Dog dog1 = context.getBean(Dog.class);  //通过spring容器获取Dog对象
        //当配置类上proxyBeanMethods=false时，断言失败
        //当配置类上proxyBeanMethods=true时，断言成功
        assertSame(dog,dog1);
    }
}
