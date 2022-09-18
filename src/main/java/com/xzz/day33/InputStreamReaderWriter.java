package com.xzz.day33;

import org.junit.Test;

import java.io.*;

/**
 * @author 徐正洲
 * @create 2022-06-09 9:19
 * <p>
 * 处理流二：转换流：属于字符流
 * <p>
 * 1）InputStreamReader：将字节输入转换成字符输入
 * 2）InputStreamWriter：将字符的输出转换成字节的输出
 * <p>
 * 作用：提供字节流与字符流之间的转换
 * <p>
 * 字符集：
 * 1）ASCII：美国标准信息交换码
 * 2）ISO8859-1：拉丁码表
 * 3）GB2312:中国的中文编码表
 * 4）GBK：中国的中文编码表升级
 * 5）Unicode：国际标准码
 * 6）UTF-8：变长的编码方式
 */
public class InputStreamReaderWriter {
    /**
     * 使用InputStreamReader将字节数据转换输出字符
     */
    @Test
    public void test() {
        InputStreamReader inputStreamReader = null;
        try {
            inputStreamReader = new InputStreamReader(new FileInputStream(new File("src\\main\\resources\\t.txt")));

            char[] datas = new char[5];
            int len;
            while ((len = inputStreamReader.read(datas)) != -1){
                String s = new String(datas,0,len);
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStreamReader!=null){
                try {
                    inputStreamReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    /**
     * 使用InputStreamReader将字节数据转换输出字符
     * 使用InputStreamWriter将字符数据转换输出字节
     */
    @Test
    public void test2() {
        InputStreamReader inputStreamReader = null;
        OutputStreamWriter outputStreamWriter = null;
        try {
            inputStreamReader = new InputStreamReader(new FileInputStream(new File("src\\main\\resources\\t.txt")));
            outputStreamWriter = new OutputStreamWriter(new FileOutputStream(new File("src\\main\\resources\\t2.txt")),"utf8");
            char[] datas = new char[5];
            int len;
            while ((len = inputStreamReader.read(datas)) != -1){
                outputStreamWriter.write(datas,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStreamReader!=null){
                try {
                    inputStreamReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (outputStreamWriter!=null){
                try {
                    outputStreamWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
    /**
    * 字符集：
    *
    */

}
