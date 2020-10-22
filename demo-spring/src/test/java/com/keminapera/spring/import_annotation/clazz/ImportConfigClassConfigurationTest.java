package com.keminapera.spring.import_annotation.clazz;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ImportConfigClassConfiguration.class)
public class ImportConfigClassConfigurationTest {
    @Autowired
    ApplicationContext context;
    @Test
    public void testConfigClass() {
        //容器中是否存在配置类bean
        Config bean = context.getBean(Config.class);
        assertNotNull(bean);
    }

    @Test
    public void testSimpleClass() {
        //容器中是否存在简单类bean
        SimpleClass simpleClass = context.getBean(SimpleClass.class);
        assertNotNull(simpleClass);
    }
}