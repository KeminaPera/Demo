package com.keminapera.spring.import_annotation.clazz;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author keminapera
 * @date 2020/10/19
 */
@Configuration
@Import({Config.class,SimpleClass.class})
public class ImportConfigClassConfiguration {

}

