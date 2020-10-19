package com.keminapera.springboot.configuration.componentscan;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author keminapera
 * @date 2020/10/1
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = MyComponentScanConfiguration.class)
public class MyComponentScanConfigurationTest {
    @Autowired
    private ApplicationContext context;

    @Test
    public void test() {
        //获取该容器所有注册的bean名称
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        //通过修改bean名称来验证你预期的bean是否已经被注册
        Matchers.arrayContaining(beanDefinitionNames).matches("subApple");
    }
}
