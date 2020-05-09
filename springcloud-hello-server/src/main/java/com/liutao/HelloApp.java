package com.liutao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RestController;

/**
 * description:
 *
 * @author : LIUTAO
 * create at : 2020/5/6 下午5:39
 **/
@SpringBootApplication
@EnableEurekaClient
@RestController
@MapperScan(basePackages = "com.liutao.dao")
@EnableFeignClients(basePackages={"com.liutao"})
public class HelloApp {

    public static void main(String[] args) {
        SpringApplication.run(HelloApp.class, args);
    }


}

