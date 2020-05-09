package com.liutao;

import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;

/**
 * description:
 *
 * @author : LIUTAO
 * create at : 2020/5/9 上午10:42
 **/
@Component
public class Receiver {

    private CountDownLatch latch = new CountDownLatch(1);

    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
        latch.countDown();
    }

    public CountDownLatch getLatch() {
        return latch;
    }

}
