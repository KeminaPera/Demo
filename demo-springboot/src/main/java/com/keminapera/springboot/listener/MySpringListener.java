package com.keminapera.springboot.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 自定义ApplicationListener类
 * 通过SpringApplication.addListers(...)
 * 和SpringApplicationBuilder.listeners(...)方式添加
 *
 * 测试类：ListenerWithSpringApplicationTest
 *
 * @author keminapera
 * @date 2020/9/10
 */
@Slf4j
@Component
public class MySpringListener implements ApplicationListener<ApplicationStartingEvent> {
    @Override
    public void onApplicationEvent(ApplicationStartingEvent event) {
        log.info("监听到ApplicationStartingEvent  时间戳timestamp={}", event.getTimestamp());
    }
}
