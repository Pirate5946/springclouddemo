package com.liutao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * description:
 *
 * @author : LIUTAO
 * create at : 2020/5/6 下午8:37
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class WebApp {

    public static void main(String[] args) {
        SpringApplication.run(WebApp.class, args);
    }
}