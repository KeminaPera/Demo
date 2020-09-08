package com.keminapera.concurrent.threadpool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.IntStream;

/**
 * @author keminapera
 * @Description TODO
 * @Date 2020/8/17 下午10:11
 */
public class Test3 {
    private static ConcurrentHashMap<String, List<String>> map = new ConcurrentHashMap<>();
    public static void main(String[] args) {
        IntStream.rangeClosed(0,500).forEach(i -> {
            new Thread(() -> {
                ArrayList<String> list = new ArrayList<>();
                list.add("aa");
                list.add("bb");
                List<String> hello = map.putIfAbsent("hello", list);
                if (null != hello) {
                    hello.addAll(list);
                }
            }).start();
        });
        System.out.println(map.get("hello").size());
    }
}
