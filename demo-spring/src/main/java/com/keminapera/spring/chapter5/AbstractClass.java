package com.keminapera.spring.chapter5;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/8/23 上午10:25
 */
@Component
public abstract class AbstractClass implements BeanNameAware {
    public abstract String getName();

    @Override
    public void setBeanName(String name) {
        System.out.println(name);
    }
}
