package com.keminapera.springboot.property;

import com.keminapera.springboot.AppConfig;
import com.keminapera.springboot.utils.ApplicationContextUtil;
import org.junit.Test;
import org.springframework.boot.SpringApplication;

import java.util.List;

/**
 * @author keminapera
 * @date 2020/9/11
 */
public class ConfigurationPropertiesTest {
    @Test
    public void testConfigurationProperties() {
        SpringApplication application = new SpringApplication(AppConfig.class);
        application.run();
        MyProperty bean = ApplicationContextUtil.getApplicationContext().getBean(MyProperty.class);
        List<String> servers = bean.getServers();
        servers.forEach(System.out::println);
    }
}
