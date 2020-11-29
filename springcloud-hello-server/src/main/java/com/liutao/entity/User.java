package com.liutao.entity;

import lombok.Builder;
import lombok.ToString;

/**
 * @ClassName User
 * @Descrption TODO
 * @Author lt
 * @Date 2020/5/30 12:38
 * @Version 1.0
 **/
@Builder(toBuilder = true)
@ToString
public class User {
    private String username;
    private String password;
}
