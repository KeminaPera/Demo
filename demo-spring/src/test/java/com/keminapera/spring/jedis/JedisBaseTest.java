package com.keminapera.spring.jedis;

import org.junit.Before;
import redis.clients.jedis.Jedis;

/**
 * @author keminapera
 * @date 2020/9/14
 */
public class JedisBaseTest {
    protected Jedis jedis;
    @Before
    public void setUp() {
        jedis = new Jedis(CommonConfig.REDIS_HOST, CommonConfig.REDIS_PORT);
    }
}
