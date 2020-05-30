package com.liutao;

import com.liutao.entity.User;

/**
 * @ClassName BuilderTest
 * @Descrption TODO
 * @Author lt
 * @Date 2020/5/30 12:39
 * @Version 1.0
 **/
public class BuilderTest {
    public static void main(String[] args) {
        User user1 = User.builder()
                .password("jdkong")
                .username("jdkong")
                .build();
        System.out.println(user1);

        User user2 = user1.toBuilder().username("jdkong2").build();
        // 验证user2是否是基于user1的现有属性创建的
        System.out.println(user2);
        // 验证对象是否是同一对象
        System.out.println(user1 == user2);
    }
}
