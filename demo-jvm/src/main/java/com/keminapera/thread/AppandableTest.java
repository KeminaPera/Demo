package com.keminapera.thread;

public class AppandableTest {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        String content = "123456789";
        builder.append(content, 1, content.length());
        System.out.println(builder.toString());
    }
}
