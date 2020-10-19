package com.keminapera.springboot.configuration.componentscan;

import com.keminapera.springboot.configuration.componentscan.base.BaseApple;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author keminapera
 * @date 2020/10/1
 */
@Configuration
//指定包路径的方式
//@ComponentScan(basePackages = "com.keminapera.springboot.configuration.componentscan.base")
//使用默认方式
//@ComponentScan
//指定基类的方式
@ComponentScan(basePackageClasses = BaseApple.class)
public class MyComponentScanConfiguration {
}
