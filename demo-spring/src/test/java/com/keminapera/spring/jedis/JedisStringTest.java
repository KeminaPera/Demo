package com.keminapera.spring.jedis;

import org.junit.Test;
import redis.clients.jedis.Transaction;

import java.util.Set;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author keminapera
 * @date 2020/9/13
 */
public class JedisStringTest extends JedisBaseTest {
    @Test
    public void testJedis() {
        String response = jedis.ping("hello redis");
        assertThat(response, equalTo("hello redis"));
    }

    @Test
    public void testStringType() {
        jedis.set("nosql", "redis");
        String result = jedis.get("nosql");
        assertThat(result, equalTo("redis"));

        Set<String> keys = jedis.keys("*");
        keys.forEach(System.out::println);
    }

    @Test
    public void testNumberType() {
        jedis.set("number", "100");
        jedis.incrBy("number", 100);
        jedis.decrBy("out", 100);
        String number = jedis.get("number");
        String out = jedis.get("out");
        System.out.println(number + "==" + out);
    }

    @Test
    public void testTransction() {

        Transaction multi = jedis.multi();
        try {
            multi.set("number", "500");
            multi.decrBy("number", 100);
            multi.incrBy("out", 100);
            multi.exec();
        }catch (Exception e) {
            System.out.println("有异常出现！！！");
             multi.discard();
        }finally {
            System.out.println(jedis.get("number"));
            System.out.println(jedis.get("out"));
            jedis.close();
        }


    }

}
