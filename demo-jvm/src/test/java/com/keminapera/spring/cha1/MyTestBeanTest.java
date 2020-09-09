package com.keminapera.spring.cha1;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class MyTestBeanTest {

    @Test
    public void test() {
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring.xml"));
        MyTestBean myTestBean = (MyTestBean) factory.getBean("myTestBean");
        assertThat(myTestBean.getHello(), equalTo("hello spring"));
    }
}