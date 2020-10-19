package com.keminapera.springboot.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author keminapera
 * @date 2020/9/12
 */
@Data
@Component
@ConfigurationProperties("acme")
public class AcmeProperties {
    private boolean enable;

    @Data
    public static class Security{
        private String username;
        private String password;
        private List<String> role = new ArrayList<>();
    }
}
