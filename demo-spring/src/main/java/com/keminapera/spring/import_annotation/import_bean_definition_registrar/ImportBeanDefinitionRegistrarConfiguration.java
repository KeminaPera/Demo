package com.keminapera.spring.import_annotation.import_bean_definition_registrar;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author keminapera
 * @date 2020/10/19
 */
@Configuration
@FruitScanner(basePackages = "com.keminapera.spring.import_annotation.import_bean_definition_registrar.fruit")
@Import(CustomImportBeanDefinitionRegistrar.class)
public class ImportBeanDefinitionRegistrarConfiguration {

}
