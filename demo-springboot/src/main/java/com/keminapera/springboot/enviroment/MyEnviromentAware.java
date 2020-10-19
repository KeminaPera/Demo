package com.keminapera.springboot.enviroment;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @author keminapera
 * @date 2020/9/11
 */
@Slf4j
@Component
public class MyEnviromentAware implements EnvironmentAware {
    @Override
    public void setEnvironment(Environment environment) {
        log.info("------------------执行到MyEnviromentAware类------------------");
    }
}
