package com.xzz.day20;

import org.junit.Test;

import java.util.Date;

/**
 * @author 徐正洲
 * @date 2022/5/27-20:27
 *
 * 日期时间
 * currentTimeMillis() 返回1970年1月1日至今时间差（毫秒）
 *
 * java.util.Date类
 *                -- java.sql.Date类
 *
 * java.util.Date
 * 1、两个构造器使用
 * new Date() 创建了一个对应当前时间的Date对象
 * new Date(1653654808749L) 返回毫秒数对应的时间
 * 2、两个方法使用
 * toString 返回当前时间
 * getTime() 返回当前对象距离1970年1月1日至今时间差（毫秒）
 *
 * java.sql.Date对应数据库的日期时间
 * 1）实例化 new java.sql.Date(1653654808749L) 返回年、月、日
 * 2）util.Date ---> sql.date对象
 *  Date date1 = new Date()
 *  java.sql.date date = new java.sql.date(date1.getTime());
 */
public class DateTime {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        System.out.println(l);
    }
    @Test
    public void test(){
        Date date1 = new Date(); //创建了一个对应当前时间的Date对象
        System.out.println(date1); //Fri May 27 20:32:17 CST 2022
        System.out.println(date1.getTime());

        Date date2 = new Date(1653654808749L);
        System.out.println(date2);
    }
    @Test
    public void test2(){
        java.sql.Date date = new java.sql.Date(1653654808749L);
        System.out.println(date);
    }
}