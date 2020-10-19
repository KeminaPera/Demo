package com.keminapera.springboot.property;

import com.keminapera.springboot.AppConfig;
import com.keminapera.springboot.utils.ApplicationContextUtil;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.springframework.boot.SpringApplication;

import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author keminapera
 * @date 2020/9/11
 */
public class DataSourcePropteryTest {
    @Test
    public void testValueProperty() {
        SpringApplication application = new SpringApplication(AppConfig.class);
        application.run();
        DataSourceProptery bean = ApplicationContextUtil.getApplicationContext().getBean(DataSourceProptery.class);
        String username = bean.getUsername();
        assertThat(username, Matchers.equalTo("keminapera"));
    }
}
