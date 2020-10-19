package com.keminapera.springboot;

import com.keminapera.springboot.property.ServerProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@EnableCaching
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class,
        scanBasePackages = {"com.keminapera.springboot", "com.keminapera.module"})
@ImportResource("classpath*:spring/application.xml")
public class AppConfig {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(AppConfig.class, args);
        ServerProperties bean = context.getBean(ServerProperties.class);
        bean.getServers();
    }
}
