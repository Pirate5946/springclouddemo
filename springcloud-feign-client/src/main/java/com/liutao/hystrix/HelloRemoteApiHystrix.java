package com.liutao.hystrix;

import com.liutao.api.HelloRemoteApi;
import org.springframework.stereotype.Component;

/**
 * description:
 *
 * @author : LIUTAO
 * create at : 2020/5/7 下午2:05
 **/
@Component
public class HelloRemoteApiHystrix implements HelloRemoteApi {

    @Override
    public String hi(String name) {
        return "fall back " + name;
    }
}
