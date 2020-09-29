package com.keminapera.springboot.conditional;

import com.keminapera.springboot.conditional.pojo.fruit.Apple;
import com.keminapera.springboot.conditional.pojo.people.Jack;
import com.keminapera.springboot.conditional.pojo.people.KeminaPera;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author KangPeng
 * @since
 */
@Configuration
public class ConditionalConfiguration {

    @Bean("keminapera1")
    @ConditionalOnProperty(name = "people.name", havingValue = "keminapera")
    @ConditionalOnClass({Apple.class})
    public KeminaPera keminaPera() {
        return new KeminaPera();
    }

    @Bean
    @ConditionalOnProperty(name = "people1.name", havingValue = "keminapera1", matchIfMissing = true)
    public KeminaPera keminaPera2() {
        return new KeminaPera();
    }

    @Bean
    @ConditionalOnBean
    public Jack jack() {
        return new Jack();
    }
}
