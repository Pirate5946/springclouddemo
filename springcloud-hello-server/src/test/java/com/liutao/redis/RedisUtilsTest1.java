package com.liutao.redis;

import com.liutao.HelloApp;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.redisson.Redisson;
import org.redisson.api.RBucket;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloApp.class)
public class RedisUtilsTest1 {

    @Autowired
    RedissonClient redissonClient;

    @Test
    public void testSet() {
        RedisUtils redisUtils = RedisUtils.getInstance();
        RBucket<Object> rBucket = redisUtils.getRBucket((Redisson) redissonClient, "key");
        rBucket.set("value2");
    }
}