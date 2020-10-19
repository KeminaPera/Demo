package com.keminapera.spring.jedis;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author keminapera
 * @date 2020/9/14
 */
public class JedisListTest extends JedisBaseTest {

    @Test
    public void testList() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("kemina", 23, "北京"));
        personList.add(new Person("lisisi", 20, "上海"));
        personList.add(new Person("zhangsan", 18, "深圳"));
        String personJson = JSON.toJSONString(personList);
        System.out.println(personJson);
        jedis.lpush("person", personJson);
        String newPerson = JSON.toJSONString(new Person("zhaosi", 11, "西安"));
        jedis.lpush("person", newPerson);
        List<String> person1 = jedis.lrange("person", 0, 1);
        for (String s : person1) {
            System.out.println(s);
        }
        //String person = jedis.rpop("person");
        //System.out.println(person);
    }

    @Test
    public void test2() {
        String person = jedis.lindex("person", 2);
        System.out.println(person);
    }

    @Test
    public void test3() {
        String shanxi = JSON.toJSONString(new Person("hello", 78, "山西"));
        jedis.lpush("person", shanxi);
    }

    @Test
    public void test4() {
        String shanxi = JSON.toJSONString(new Person("hello", 78, "山西"));
        Long person = jedis.lrem("person", 1, shanxi);
        System.out.println(person);
    }
}
