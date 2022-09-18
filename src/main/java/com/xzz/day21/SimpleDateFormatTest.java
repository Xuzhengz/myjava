package com.xzz.day21;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 徐正洲
 * @date 2022/5/28-20:19
 * SimpleDateFormat：对Date类格式化和解析
 * 日期--》字符串 format()
 * simpleDateFormat.format(date)
 *
 * 字符串--》日期 parse()
 * 默认格式要求：22-5-28 下午8:25
 * 自定义格式：new SimpleDateFormat("yyyy-MM-dd hh:mm:ss")
 *
 *
 */
public class SimpleDateFormatTest {
    public static void main(String[] args) throws ParseException {
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
//        Date date = new Date();
//        System.out.println(simpleDateFormat.format(date));

        //日期字符串格式有要求
        String dateTime = "2017-08-16";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = simpleDateFormat.parse(dateTime);
        java.sql.Date date1 = new java.sql.Date(parse.getTime());
        System.out.println(date1);

        //参数构造器
//        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        System.out.println(simpleDateFormat1.format(date));
    }
}