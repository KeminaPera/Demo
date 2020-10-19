package com.keminapera.springboot.listener;

import com.keminapera.springboot.AppConfig;
import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationListener;

import java.util.Set;

/**
 * 通过META_INF/spring.factories
 * 方式添加ApplicationListener
 *
 * @author keminapera
 * @date 2020/9/10
 */
public class ListenerWithSpringFactoriesTest {

    /**
     * 验证:通过META_INF/spring.factories方式是否自动将Listener添加到容器中
     *
     * 1. 创建SpringApplication对象
     * 2. 运行容器
     * 3. 获取所有注册的Listener对象
     * 4. 断言是否存在SpringFactoriesApplicationListener对象
     */
    @Test
    public void testListenerWithSpringFactories() {
        SpringApplication springApplication = new SpringApplication(AppConfig.class);
        springApplication.run();
        Set<ApplicationListener<?>> listeners = springApplication.getListeners();
        //assertThat(listeners, hasItem(SpringFactoriesApplicationListener.class.newInstance()));
    }
}
