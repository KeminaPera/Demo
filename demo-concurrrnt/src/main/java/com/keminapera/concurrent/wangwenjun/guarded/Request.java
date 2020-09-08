package com.keminapera.concurrent.wangwenjun.guarded;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/7/16 下午10:34
 */
public class Request {
    private final String content;

    public Request(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}