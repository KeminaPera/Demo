package com.keminapera.springboot.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author keminapera
 * @date 2020/10/1
 */
@Data
@Component
@ConfigurationProperties("my")
public class ServerProperties {
    private String name;
    private List<Server> servers = new ArrayList<>();
}

@Data
class Server{
    private String userName;
    private String url;
}
