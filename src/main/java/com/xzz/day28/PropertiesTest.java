package com.xzz.day28;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author 徐正洲
 * @date 2022/6/4-19:45
 * <p>
 * Properties:key和value都是字符串类型
 */
public class PropertiesTest {
    public static void main(String[] args) {
        try {
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream("src\\main\\resources\\xzz.properties");
            properties.load(fileInputStream);
            String name = properties.getProperty("name");
            String age = properties.getProperty("age");
            System.out.println(name + " \t" + age);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }


    }
}