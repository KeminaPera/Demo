package com.keminapera.springboot.enviroment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * 自定义的EnviromentPostProcessor
 *
 * @author keminapera
 * @date 2020/9/11
 */
@Component
public class MyEnviromentPostProcessor implements EnvironmentPostProcessor {
    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        Map<String, Object> systemProperties = environment.getSystemProperties();
        for (Map.Entry<String, Object> entry : systemProperties.entrySet()) {
            System.out.println(entry.getKey() + "==" + entry.getValue());
        }
    }
}
