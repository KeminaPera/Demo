package com.keminapera.spring.import_annotation.import_selector;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ImportSelectorConfiguration.class)
public class ImportSelectorConfigurationTest {
    @Autowired
    ApplicationContext context;
    @Test
    public void test() {
        LovelyDog lovelyDog = (LovelyDog) context.getBean("com.keminapera.spring.import_annotation.import_selector.LovelyDog");
        assertNotNull(lovelyDog);
    }
    @Test
    public void testExclusionFilter() {
        boolean isExit = context.containsBean("com.keminapera.spring.import_annotation.import_selector.SweetFruit");
        assertFalse(isExit);
    }
}