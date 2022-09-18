package com.xzz.day22;

import org.junit.Test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * @author 徐正洲
 * @date 2022/5/29-16:14
 *
 * DateTimeFormat：格式化或解析日期、时间  类似SimpleDateFormat
 */
public class DateTimeFormatTest {
    @Test
    public void test(){
//        方式一：预定义的标准格式
        DateTimeFormatter isoLocalDateTime = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

//        格式化  日期--字符串
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println(isoLocalDateTime.format(now));

//        解析   字符串--日期
        String date ="2022-05-29T16:19:56.944";
        System.out.println(isoLocalDateTime.parse(date));

//        方式二：本地模式
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        String format = dateTimeFormatter.format(now);
        System.out.println(format);

        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println(dateTimeFormatter1.format(now));


//        重点方式三：自定义格式-- ofPattern
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(dateTimeFormatter2.format(LocalDate.now()));
//        解析
        String date1 ="2022-05-29";
        System.out.println(dateTimeFormatter2.parse(date1));

    }


}