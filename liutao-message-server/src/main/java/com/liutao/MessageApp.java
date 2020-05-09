package com.liutao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * description:
 *
 * @author : LIUTAO
 * create at : 2020/5/9 上午10:52
 **/
@SpringBootApplication
@EnableEurekaClient
//@EnableAsync
//@EnableFeignClients
//@MapperScan
public class MessageApp {


    public static void main(String[] args) {
        SpringApplication.run(MessageApp.class, args);
    }

}
