package com.keminapera.spring.beanvalidation.pojo;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * @author keminapera
 * @date 2020/10/11
 */
@Data
public class User {
    @NotNull
    private String name;
    @Min(0)
    @Max(120)
    private Integer age;
}
