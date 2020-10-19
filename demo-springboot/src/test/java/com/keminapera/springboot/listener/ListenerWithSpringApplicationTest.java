package com.keminapera.springboot.listener;

import com.keminapera.springboot.AppConfig;
import org.junit.Test;
import org.springframework.boot.SpringApplication;


/**
 * 通过SpringApplication.addListers(...)
 * 和SpringApplicationBuilder.listeners(...)
 * 方式添加ApplicationListener
 *
 * @author keminapera
 */
public class ListenerWithSpringApplicationTest {
    /**
     * 1. 手动创建SpringApplication对象
     * 2. 添加自定ApplicationListener监听ApplicationStartingEvent事件
     * 3. 判断是否调用了对应方法
     */
    @Test
    public void testListener() {
        SpringApplication springApplication = new SpringApplication(AppConfig.class);
        MySpringListener listener = new MySpringListener();
        springApplication.addListeners(listener);
        springApplication.run();
    }
}
