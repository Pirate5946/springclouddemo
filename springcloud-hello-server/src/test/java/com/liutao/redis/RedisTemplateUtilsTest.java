package com.liutao.redis;

import com.liutao.HelloApp;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloApp.class)
public class RedisTemplateUtilsTest {

    @Resource
    RedisTemplateUtils redisTemplateUtils;

    @Test
    public void set() {
        redisTemplateUtils.set("key11", "大力");
    }
}