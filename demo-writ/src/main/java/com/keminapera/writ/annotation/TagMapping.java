package com.keminapera.writ.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface TagMapping {
    String key();
    String bookMark();
    String value() default "";
    String callback() default "";
    boolean isHide() default false;
    String description() default "";
}
