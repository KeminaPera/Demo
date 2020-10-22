package com.keminapera.spring.import_annotation.import_bean_definition_registrar;

import com.keminapera.spring.import_annotation.import_bean_definition_registrar.fruit.Apple;
import com.keminapera.spring.import_annotation.import_bean_definition_registrar.fruit.Banana;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ImportBeanDefinitionRegistrarConfiguration.class)
public class ImportBeanDefinitionRegistrarConfigurationTest {
    @Autowired
    ApplicationContext context;
    @Test
    public void testApple() {
        Apple apple = context.getBean(Apple.class);
        assertNotNull(apple);
    }

    @Test
    public void testBanana() {
        Banana banana = (Banana) context.getBean("banana");
        assertNotNull(banana);
    }

    @Test
    public void testPig() {
        boolean result = context.containsBean("pig");
        assertFalse(result);
    }
}