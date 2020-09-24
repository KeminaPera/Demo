package com.keminapera.jdkapi.collection;

import org.hamcrest.core.IsEqual;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * @author KangPeng
 */
public class Java8NewFuture {
    private Map<String, String> map;
    private static final String KEY = "HELLO";

    @Before
    public void setup() {
        map = new HashMap<>();
    }
    @Test
    public void test00() {
        String result = map.getOrDefault(KEY, "world");
        assertThat(result, IsEqual.equalTo("world"));
    }

    @Test
    public void test01() {
        map.put(KEY, null);
        String result = map.getOrDefault(KEY, "wrold");
        assertThat(result, IsEqual.equalTo(null));
    }

    //--------------------putIfAbsent--------------------

    /**
     * 该map中存在该key对应的key-value映射(value不为null)，执行该方法会返回旧的value
     */
    @Test
    public void test03() {
        map.put(KEY, "redis");
        String result = map.putIfAbsent(KEY, "world");
        assertThat(result, IsEqual.equalTo("redis"));
    }

    /**
     * 该map中存在该key对应的key-value映射(value为null)，执行该方法会返旧值（null）
     */
    @Test
    public void test04() {
        map.put(KEY, null);
        String firstResult = map.putIfAbsent(KEY, "world");
        assertThat(firstResult, IsEqual.equalTo(null));

        String secondResult = map.get(KEY);
        assertThat(secondResult, IsEqual.equalTo("world"));
    }

    /**
     * 该map中不存在该key对应的映射，执行该方法会返null
     */
    @Test
    public void test05() {
        String firstResult = map.putIfAbsent(KEY, "world");
        assertThat(firstResult, IsEqual.equalTo(null));

        String secondResult = map.get(KEY);
        assertThat(secondResult, IsEqual.equalTo("world"));
    }

    //--------------------remove--------------------
    //如果map中指定的key的value和给定的value相等，则从map中移除
    @Test
    public void test06() {
        map.put(KEY, "world");
        boolean result = map.remove(KEY, "world");
        assertTrue(result);
    }

    //--------------------replace--------------------
    @Test
    public void test07() {
        map.put(KEY, "world");
        String firstResult = map.replace(KEY, "redis");
        assertThat(firstResult, IsEqual.equalTo("world"));

        String secondResult = map.get(KEY);
        assertThat(secondResult, IsEqual.equalTo("redis"));
    }

    @Test
    public void test08() {
        String firstResult = map.replace(KEY, "world");
        assertThat(firstResult, IsEqual.equalTo(null));

        String secondResult = map.get(KEY);
        assertThat(secondResult, IsEqual.equalTo(null));
    }

    @Test
    public void test09() {
        map.put(KEY, "redis");
        boolean result = map.replace(KEY, "redis", "world");
        assertTrue(result);
    }

    //--------------------replaceAll--------------------
    @Test
    public void test10() {

    }
}
