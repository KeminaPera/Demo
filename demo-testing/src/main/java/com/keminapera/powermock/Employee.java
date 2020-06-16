package com.keminapera.powermock;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/6/6 下午10:11
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private String id;
    private String name;
    private Integer age;
    private String city;

}
