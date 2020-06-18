package com.keminapera.junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/6/18 下午8:42
 */
public class ParameterizedTest {

    @Test
    public void StringLengthUpper5(String string) {
        assertTrue(string != null && string.length() > 5);
    }
}
