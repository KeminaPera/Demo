package com.keminapera.springboot.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author keminapera
 * @date 2020/9/11
 */
@Component
public class NameProperty {
    @Value("${name}")
    private String name;

    public String getName() {
        return name;
    }
}
