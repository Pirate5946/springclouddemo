package com.liutao.redis;

import org.redisson.api.RSet;
import org.redisson.api.RedissonClient;
import org.redisson.client.RedisClient;
import org.redisson.client.RedisConnection;
import org.redisson.client.protocol.RedisCommands;
import org.redisson.client.protocol.RedisStrictCommand;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * description:
 *
 * @author : LIUTAO
 * create at : 2020/5/24 上午11:06
 **/
public class RedissonTest {

    /**
     * The Redisson client.
     */
    @Autowired
    protected RedissonClient redissonClient;

    public void set(String key, String value) {
//        RedisStrictCommand<Long> incr = RedisCommands.INCR;
//        RedisConnection connection = new RedisConnection(redissonClient);



    }
}
