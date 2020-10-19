package com.keminapera.springboot.property;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author keminapera
 * @date 2020/9/11
 */
@Getter
@Component
public class DataSourceProptery {
    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password}")
    private String password;
}
