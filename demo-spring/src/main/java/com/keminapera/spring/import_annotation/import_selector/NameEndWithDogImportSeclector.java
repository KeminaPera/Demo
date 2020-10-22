package com.keminapera.spring.import_annotation.import_selector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.function.Predicate;

/**
 * @author keminapera
 * @date 2020/10/19
 */
public class NameEndWithDogImportSeclector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        String[] condition = {"com.keminapera.spring.import_annotation.import_selector.LovelyDog",
                "com.keminapera.spring.import_annotation.import_selector.SweetFruit"};
        return condition;
    }

    @Override
    public Predicate<String> getExclusionFilter() {
        //类名不是以Dog结尾的将被过滤掉
        Predicate<String> predicate = className -> !className.endsWith("Dog");
        return predicate;
    }
}
