package com.liutao.controller;

import com.liutao.api.HelloRemoteApi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * description:
 *
 * @author : LIUTAO
 * create at : 2020/5/6 下午8:38
 **/
@RestController
public class HelloController {

    @Resource
    private HelloRemoteApi helloRemoteApi;

    @RequestMapping("/")
    public String hi(String name){
        //这里直接写的是服务名： springcloud-eureka-serviceprovider  。在ribbon中它会根据服务名来选择具体的服务实例，根据服务实例在请求的时候会用具体的url替换掉服务名
        return helloRemoteApi.hi(name);
    }
}

