package com.keminapera.springboot.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 通过META_INF/spring.factories方式添加
 * 测试类：ListenerWithSpringFactoriesTest
 *
 * @author keminapera
 * @date 2020/9/10
 */
@Slf4j
@Component
public class SpringFactoriesApplicationListener implements ApplicationListener<ApplicationStartingEvent> {
    @Override
    public void onApplicationEvent(ApplicationStartingEvent event) {
        log.info("SpringFactoriesApplicationListener监听到ApplicationStartingEvent  timestamp={}", event.getTimestamp());
    }
}
