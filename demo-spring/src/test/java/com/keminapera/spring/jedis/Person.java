package com.keminapera.spring.jedis;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author keminapera
 * @date 2020/9/14
 */
@NoArgsConstructor
@Setter
@Getter
public class Person {
    private String name;
    private Integer age;
    private String address;

    public Person(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
