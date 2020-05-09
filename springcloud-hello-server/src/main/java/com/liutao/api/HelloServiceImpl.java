package com.liutao.api;

import api.HelloApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description:
 *
 * @author : LIUTAO
 * create at : 2020/5/6 下午8:48
 **/
@RestController
public class HelloServiceImpl implements HelloApi {
    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    @Override
    public String hi(String name) {
        return String.format("hello %s , from port=%s", name, port);
    }
}
