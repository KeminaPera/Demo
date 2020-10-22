package com.keminapera.spring.import_annotation.import_bean_definition_registrar;

import java.lang.annotation.*;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Fruit {
}
