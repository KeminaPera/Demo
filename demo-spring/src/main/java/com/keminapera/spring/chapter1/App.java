package com.keminapera.spring.chapter1;

import com.keminapera.spring.chapter1.filter.KeminaFilter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/8/18 下午10:00
 */
@ComponentScan(value = "com.keminapera.spring",
        excludeFilters = @ComponentScan.Filter(type = FilterType.CUSTOM, classes = KeminaFilter.class)
)
public class App {
    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
        int beanDefinitionCount = context.getBeanDefinitionCount();
        System.out.println(beanDefinitionCount);
    }
}
