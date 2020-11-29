package com.liutao.test;

import java.util.ArrayList;
import java.util.List;

/**
 * description:
 *
 * @author : LIUTAO
 * create at : 2020/6/10 上午10:26
 **/
public class SubListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i));
        }
        List<String> subList = list.subList(1, 7);
        for (String s : subList) {
            System.out.println(s);
        }
    }
}
