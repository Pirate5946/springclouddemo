package com.liutao.test;

import com.liutao.Receiver;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * description:
 *
 * @author : LIUTAO
 * create at : 2020/5/9 上午11:04
 **/
@Component
public class TestMessageSend {

    @Autowired
    private static RabbitTemplate rabbitTemplate;

    @Autowired
    private static Receiver receiver;

    public static final String topicExchangeName = "spring-boot-exchange";

    public static void main(String[] args) {
        System.out.println("Sending message...");
        rabbitTemplate.convertAndSend(topicExchangeName, "foo.bar.baz", "Hello from RabbitMQ!");
        try {
            receiver.getLatch().await(10000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
