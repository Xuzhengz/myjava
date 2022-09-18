package com.xzz.day32;

import org.junit.Test;

import java.io.*;
import java.util.HashMap;

/**
 * @author 徐正洲
 * @date 2022/6/8-20:06
 */
public class Exer {
    /**
     * 图片的加密
     */
    @Test
    public void test() {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(new File("src\\main\\resources\\01.png"));
            fileOutputStream = new FileOutputStream(new File("src\\main\\resources\\02.png"));

            byte[] datas = new byte[20];
            int len;

            while ((len = fileInputStream.read(datas)) != -1) {

                for (int i = 0; i < len; i++) {
                    datas[i] = (byte) (datas[i] ^ 5);
                }
                fileOutputStream.write(datas);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 图片的解密
     */
    @Test
    public void test2() {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(new File("src\\main\\resources\\02.png"));
            fileOutputStream = new FileOutputStream(new File("src\\main\\resources\\03.png"));

            byte[] datas = new byte[20];
            int len;

            while ((len = fileInputStream.read(datas)) != -1) {

                for (int i = 0; i < len; i++) {
                    datas[i] = (byte) (datas[i] ^ 5);
                }
                fileOutputStream.write(datas);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 获取文本每个字符出现的此时
     */
    @Test
    public void test3() {
        FileReader fileReader = null;
        try {
//        1、创建Map集合
            HashMap<Character, Integer> characterIntegerHashMap = new HashMap<>();

//        2、遍历文件，每一个字符出现的次数放到map中
            fileReader = new FileReader(new File("src\\main\\resources\\smalltable"));
            int len;
            while ((len = fileReader.read()) != -1) {
                char data = (char) len;
                //            1、判断data是否在文件第一次出现
                if (characterIntegerHashMap.get(data) == null) {
                    characterIntegerHashMap.put(data, 1);
                } else {
                    characterIntegerHashMap.put(data, characterIntegerHashMap.get(data) + 1);
                }
            }
            System.out.println(characterIntegerHashMap);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }


    }
}