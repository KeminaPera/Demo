package com.keminapera.springboot.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author keminapera
 * @date 2020/9/11
 */
@Component
@ConfigurationProperties(prefix = "my.servers")
public class MyProperty {
    private List<String> servers = new ArrayList<>();

    public void setServers(List<String> servers) {
        this.servers = servers;
    }
    public List<String> getServers() {
        return servers;
    }
}
