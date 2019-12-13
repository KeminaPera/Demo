package com.keminapera.xml;

import lombok.Data;

import javax.xml.bind.annotation.*;

/**
 * 包装类
 *
 * @author KeminaPera
 * @date 2019/12/4 21:46
 */
@Data
@XmlType
@XmlRootElement(name = "person")
@XmlAccessorType(XmlAccessType.FIELD)
public class Person {
    @XmlAttribute(name = "name")
    private String name;
    @XmlElement(name = "age")
    private Integer age;
    @XmlElement(name = "address")
    private Address address;
    @XmlEnumValue("typeValue")
    private String typeValue;
    /*@XmlEnum(Type.class)
    private Type type;*/
}
