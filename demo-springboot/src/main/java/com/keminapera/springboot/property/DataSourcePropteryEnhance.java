package com.keminapera.springboot.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author keminapera
 * @date 2020/9/11
 */
@Data
@Component
@ConfigurationProperties(prefix = "spring.datasource")
public class DataSourcePropteryEnhance {
    private String username;
    private String password;

    @Data
    public static class User{
        private String name;
        private Integer age;
    }
}
