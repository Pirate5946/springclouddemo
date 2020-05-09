package com.liutao.api;

import api.HelloApi;
import com.liutao.hystrix.HelloRemoteApiHystrix;
import org.springframework.cloud.openfeign.FeignClient;


/**
 * description:通过FeignClient配置负载均衡，指定了服务提供者的名字
 *
 * @author : LIUTAO
 * create at : 2020/5/6 下午8:32
 **/

@FeignClient(value = "springcloud-hello-server", fallback = HelloRemoteApiHystrix.class)
public interface HelloRemoteApi extends HelloApi {


}
