package com.keminapera.spring;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author KangPeng
 * @since
 */
public class Test2 {
    private ConcurrentHashMap <String, List<String>> map = new ConcurrentHashMap<>();
    @Test
    public void test() {
        map.computeIfAbsent("hello", unUse -> new ArrayList<>()).add("world");
        System.out.println(map.get("hello"));
    }

    private ConcurrentHashMap<String, String> collection = new ConcurrentHashMap<>();

    @Test
    public void test1() {
        collection.computeIfAbsent("hello", a -> "baidu");
        collection.computeIfAbsent("hello", a -> "huawei");
        collection.computeIfAbsent("hello", a -> "sanxing");
        collection.computeIfAbsent("hello", a -> "tengxun");

        System.out.println(collection.get("hello"));
    }
}
