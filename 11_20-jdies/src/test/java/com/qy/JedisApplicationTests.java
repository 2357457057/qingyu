package com.qy;

import org.junit.jupiter.api.Test;
import org.junit.platform.engine.support.descriptor.ClasspathResourceSource;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import redis.clients.jedis.Jedis;

import java.util.Properties;

@SpringBootTest
class JedisApplicationTests {

    @Test
    void contextLoads() throws Exception{
        Jedis jedis = new Jedis("139.9.65.29",6379);
        System.out.println(jedis.ping());
        System.out.println(jedis.get("k2"));
        Properties properties = new Properties();
        ClassPathResource cpr = new ClassPathResource("redisConfig.properties");
        properties.load(cpr.getInputStream());
        String url = properties.getProperty("url");
        System.out.println(url);
    }

}
