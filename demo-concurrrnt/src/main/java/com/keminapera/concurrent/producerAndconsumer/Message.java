package com.keminapera.concurrent.producerAndconsumer;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/7/29 下午9:07
 */
public class Message {
    private final String data;

    public Message(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return data;
    }
}
