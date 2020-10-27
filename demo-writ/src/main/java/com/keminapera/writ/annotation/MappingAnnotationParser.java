package com.keminapera.writ.annotation;

import com.keminapera.writ.AbstractWritFillCallback;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Component;

/**
 * @author KangPeng
 * @since
 */
@Component
public class MappingAnnotationParser implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        TagMapping tagMappingAnnotation = AnnotationUtils.findAnnotation(bean.getClass(), TagMapping.class);
        if (tagMappingAnnotation != null) {
            // 可以做一些校验工作 以及对没有赋值的属性进行一些初始化操作
            if (bean instanceof AbstractWritFillCallback) {
                AbstractWritFillCallback.TagMapping tagMapping = new AbstractWritFillCallback.TagMapping(tagMappingAnnotation.key(), tagMappingAnnotation.bookMark(),
                        tagMappingAnnotation.callback(), tagMappingAnnotation.value(), tagMappingAnnotation.description());
                ((AbstractWritFillCallback) bean).setTagMapping(tagMapping);
            }
         }
        return bean;
    }
}
