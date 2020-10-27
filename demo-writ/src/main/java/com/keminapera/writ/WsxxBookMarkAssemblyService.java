package com.keminapera.writ;

import com.keminapera.writ.annotation.Processor;
import com.keminapera.writ.util.WritAnnotationUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author KangPeng
 * @since
 */
@Service
@Slf4j
public class WsxxBookMarkAssemblyService implements ApplicationContextAware {
    private ApplicationContext context;
    private final static Map<String, IPreWritProcessor> processorMap = new HashMap<String, IPreWritProcessor>();

    @PostConstruct
    private void init () {
        Collection<IPreWritProcessor> preWritProcessorList = context.getBeansOfType(IPreWritProcessor.class).values();
        for (IPreWritProcessor preWritProcessor : preWritProcessorList) {
            processorMap.put(WritAnnotationUtils.getString(preWritProcessor.getClass(), Processor.class, "key"), preWritProcessor);
        }
        log.info("有"+ processorMap.size() + "个前置文书处理类");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }
}
