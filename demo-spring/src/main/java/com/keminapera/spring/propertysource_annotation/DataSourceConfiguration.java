package com.keminapera.spring.propertysource_annotation;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/**
 * @author keminapera
 * @date 2020/10/24
 */
@Configuration
@PropertySources({
        @PropertySource("classpath:com.keminapera.spring.propertysource_annotation/mysql.properties"),
        @PropertySource("classpath:com.keminapera.spring.propertysource_annotation/oracle.properties")})
@PropertySource(value = "classpath:com.keminapera.spring.propertysource_annotation/redis.properties")
public class DataSourceConfiguration {
}
