package com.keminapera.writ.util;

import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.lang.Nullable;

import java.lang.annotation.Annotation;

/**
 * @author KangPeng
 * @since
 */
public final class WritAnnotationUtils {
    private WritAnnotationUtils() {
        throw new IllegalStateException("This is AnnotationUtils class");
    }

    public static String getString(Class<?> clazz, @Nullable Class annotationType, String name) {
        Annotation targetAnnotation = AnnotationUtils.findAnnotation(clazz, annotationType);
        if (targetAnnotation == null) {
            throw new IllegalStateException(clazz.getSimpleName() + " not found " + annotationType.getName());
        }
        AnnotationAttributes annotationAttributes = AnnotationUtils.getAnnotationAttributes(null, targetAnnotation);
        String string = annotationAttributes.getString(name);
        return string;
    }
}
