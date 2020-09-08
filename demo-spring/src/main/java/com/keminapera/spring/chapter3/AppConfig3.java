package com.keminapera.spring.chapter3;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/8/18 下午10:45
 */
@Configuration
@Import(value = {Person.class, KeminaImportSelector.class})
public class AppConfig3 {
}
