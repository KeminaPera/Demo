package com.keminapera.mockito;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/6/15 下午9:58
 */
@Data
@AllArgsConstructor
public class User {
    private String id;
    private String name;
    private Integer age;
}
