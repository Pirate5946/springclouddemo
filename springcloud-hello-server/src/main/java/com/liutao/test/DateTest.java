package com.liutao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * description:
 *
 * @author : LIUTAO
 * create at : 2020/6/9 下午8:42
 **/
public class DateTest {
    public static void main(String[] args) throws ParseException {
//        Date date = new Date("20200607");
        String pattern = "yyyyMMdd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date parse = simpleDateFormat.parse("20201107");

        String pattern1 = "M月dd日";
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat(pattern1);
        String format = simpleDateFormat1.format(parse);
        System.out.println(format);
    }
}
