package com.keminapera.writ.baws;

import com.keminapera.writ.AbstractPreWritProcessor;
import com.keminapera.writ.annotation.Processor;
import com.keminapera.writ.annotation.TagMapping;
import com.keminapera.writ.baws.callback.impl.IBawsWritFillCallback;
import com.keminapera.writ.util.WritAnnotationUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author KangPeng
 * @since
 */
@Slf4j
@Component
@Processor(key = "本案裁判文书")
public class BawsWritProcessor extends AbstractPreWritProcessor implements ApplicationContextAware {

    private ApplicationContext context;
    private Map<String, IBawsWritFillCallback> bawsWritFillCallbackMap = new HashMap<>();

    @PostConstruct
    public void init() {
        Collection<IBawsWritFillCallback> bawsWritFillCallbackList = context.getBeansOfType(IBawsWritFillCallback.class).values();
        for (IBawsWritFillCallback bawsWritFillCallback : bawsWritFillCallbackList) {
            bawsWritFillCallbackMap.put(WritAnnotationUtils.getString(bawsWritFillCallback.getClass(), TagMapping.class, "key"), bawsWritFillCallback);
        }
        log.info("有" + bawsWritFillCallbackMap.size()+ "个回调类");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }
}
