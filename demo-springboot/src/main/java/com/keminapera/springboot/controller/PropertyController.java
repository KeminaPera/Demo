package com.keminapera.springboot.controller;

import com.keminapera.springboot.property.AcmeProperties;
import com.keminapera.springboot.property.NameProperty;
import com.keminapera.springboot.utils.ApplicationContextUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author keminapera
 * @date 2020/9/11
 */
@Slf4j
@RestController
@RequestMapping("/v1/property")
public class PropertyController {
    @Autowired
    private AcmeProperties acmeProperties;
    @GetMapping("/value")
    public String nameProperty() {
        NameProperty bean = ApplicationContextUtil.getApplicationContext().getBean(NameProperty.class);
        return bean.getName();
    }

    @GetMapping("/acme")
    public String acmeProperties() {
        log.info("PropertyController 接收到了请求....");
        boolean enable = acmeProperties.isEnable();
        System.out.println(enable);
        return acmeProperties.toString();
    }
}
