package com.keminapera.xml;

import lombok.Getter;

@Getter
public enum Type {
    /**
     * 学生
     */
    STUDENT("学生"),
    /**
     * 老师
     */
    TEACHER("老师"),
    /**
     * 工人
     */
    WORKER("工人");
    Type(String type) {
        this.type = type;
    }

    private String type;
}
