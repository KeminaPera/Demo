package com.keminapera.jdkapi.spi;

import org.junit.Test;

import java.nio.charset.StandardCharsets;

/**
 * @author keminapera
 * @date 2020/10/12
 */
public class SpiTest {
    @Test
    public void test() {
        Encoder encoder = CodecsFactory.getEncoder(StandardCharsets.UTF_8.name());
        System.out.println(encoder);
    }
}
