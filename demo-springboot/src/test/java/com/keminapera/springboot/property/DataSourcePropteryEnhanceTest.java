package com.keminapera.springboot.property;

import com.keminapera.springboot.AppConfig;
import com.keminapera.springboot.utils.ApplicationContextUtil;
import org.junit.Test;
import org.springframework.boot.SpringApplication;

/**
 * @author keminapera
 * @date 2020/9/11
 */
public class DataSourcePropteryEnhanceTest {
    @Test
    public void test() {
        SpringApplication application = new SpringApplication(AppConfig.class);
        application.run();
        DataSourcePropteryEnhance bean = ApplicationContextUtil.getApplicationContext().getBean(DataSourcePropteryEnhance.class);
        System.out.println(bean.getUsername() + "==" + bean.getPassword());
    }
}
