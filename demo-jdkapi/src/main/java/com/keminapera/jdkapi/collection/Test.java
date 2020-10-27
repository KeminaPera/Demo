package com.keminapera.jdkapi.collection;

import org.apache.commons.lang3.StringUtils;

import java.util.Optional;

/**
 * @author KangPeng
 * @since
 */
public class Test {
    public static void main(String[] args) {
        String result = "123";
        String tempResult = StringUtils.EMPTY;
        String value = Optional.ofNullable(tempResult).filter(StringUtils::isNotBlank).orElse(result);
        System.out.println(value);
    }
}
