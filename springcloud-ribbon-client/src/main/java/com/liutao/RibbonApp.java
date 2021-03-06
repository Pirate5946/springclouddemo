package com.liutao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * description:
 *
 * @author : LIUTAO
 * create at : 2020/5/6 下午8:18
 **/
@SpringBootApplication
@EnableEurekaClient //启用EurekaClient组件
//@EnableDiscoveryClient  //启用服务发现组件
public class RibbonApp {

    public static void main(String[] args) {
        SpringApplication.run(RibbonApp.class, args);
    }

    /**
     * springcloud中提倡rest风格的微服务
     * 想spring容器中注入RestTemplate
     *
     * 使用LoadBalanced表明这个restRemplate开启负载均衡的功能。
     * @return
     */
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

