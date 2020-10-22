package com.keminapera.spring.import_annotation.import_bean_definition_registrar;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.StandardAnnotationMetadata;

import java.util.Map;

/**
 * @author keminapera
 * @date 2020/10/20
 */
public class CustomImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry, BeanNameGenerator importBeanNameGenerator) {
        if (importingClassMetadata instanceof StandardAnnotationMetadata) {
            StandardAnnotationMetadata configAnnotationMetadata = (StandardAnnotationMetadata) importingClassMetadata;
            Map<String, Object> annotationAttributes = configAnnotationMetadata.getAnnotationAttributes(FruitScanner.class.getName(), true);
            String[] basePackages = (String[]) annotationAttributes.get("basePackages");
            ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner(registry, false);
            //定义自己的includeFilter
            FruitTypeFilter typeFilter = new FruitTypeFilter();
            scanner.addIncludeFilter(typeFilter);
            scanner.scan(basePackages);
        }
    }
}
