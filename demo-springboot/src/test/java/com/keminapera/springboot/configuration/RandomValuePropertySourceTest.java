package com.keminapera.springboot.configuration;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author keminapera
 * @date 2020/9/11
 */
public class RandomValuePropertySourceTest {
    @Value("${random.int}")
    private Integer num;
    @Test
    public void testRandom() {
        System.out.println(num);
    }
}
