package com.keminapera.spring.propertysource_annotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringJUnitConfig(classes = DataSourceConfiguration.class)
public class DataSourceConfigurationTest {
    @Autowired
    ApplicationContext context;
    @Test
    public void testUserName() {
        String userName = context.getEnvironment().getProperty("mysql.user.name");
        assertThat(userName, equalTo("mysql"));
    }
    @Test
    public void testPassword() {
        String password = context.getEnvironment().getProperty("oracle.user.password");
        assertThat(password, equalTo("123456"));
    }
    @Test
    public void testRedisName() {
        String redisName = context.getEnvironment().getProperty("reids.name");
        assertThat(redisName, equalTo("redis"));
    }
    @Test
    public void testRedisPassword() {
        String redisPassword = context.getEnvironment().getProperty("redis.password");
        assertThat(redisPassword, equalTo("123456"));
    }
}