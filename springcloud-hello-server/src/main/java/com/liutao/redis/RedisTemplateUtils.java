package com.liutao.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * description:
 *
 * @author : LIUTAO
 * create at : 2020/5/25 上午10:18
 **/
@Component
public class RedisTemplateUtils {

    /**
     * defaultRedisTemplate 对应 57的0库
     */
    @Resource
    private RedisTemplate<String, Object> defaultRedisTemplate;

    public boolean set(String key, Object value) {
        try {
            ValueOperations<String, Object> opsForValue = defaultRedisTemplate.opsForValue();
            opsForValue.set(key, value);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
