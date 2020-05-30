package com.liutao.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName TestEntity1
 * @Descrption TODO
 * @Author lt
 * @Date 2020/5/30 10:33
 * @Version 1.0
 **/

@Builder
public class TestEntity1 {
    private final Integer code = 200;
    private String username;
    private String password;
}
