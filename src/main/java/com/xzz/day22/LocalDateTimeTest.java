package com.xzz.day22;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


/**
 * @author 徐正洲
 * @date 2022/5/29-16:05
 */
public class LocalDateTimeTest {
    @Test
    public void test() {
//        1、 now实例化
        LocalTime localTime = LocalTime.now();
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(localDateTime.getYear());

//        2、of实例化,自定义时间
        LocalDateTime localDateTime1 = LocalDateTime.of(2000, 12, 28, 12, 12);
        System.out.println(localDateTime1.getYear());
        System.out.println(localDateTime1.toString());
    }


    }