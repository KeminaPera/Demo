package com.keminapera.jdkapi.collection;

import java.util.*;

public class MyMap {
    public static void main(String[] args) {
        Map<String, List<Object>> collection = new HashMap<>();
        collection.computeIfAbsent("hello", i -> new ArrayList<>()).add("world");
        System.out.println(collection.size());
    }
}
