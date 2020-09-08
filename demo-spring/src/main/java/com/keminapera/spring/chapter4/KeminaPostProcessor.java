package com.keminapera.spring.chapter4;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/8/20 下午10:48
 */
@Component
public class KeminaPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(bean + "----postProcessBeforeInitialization----" + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(bean + "----postProcessAfterInitialization----" + beanName);
        return bean;
    }
}
