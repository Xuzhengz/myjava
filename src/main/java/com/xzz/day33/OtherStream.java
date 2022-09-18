package com.xzz.day33;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 徐正洲
 * @date 2022/6/9-19:20
 *
 * 其他流
 * 1）标准的输入输出流
 * 2）打印流
 * 3）数据流
 */
public class OtherStream {
    /**
    *
    * 1）标准的输入输出流
     * System.in ：键盘输入
     * System.out： 控制台输出
     * System的setIn setOut 重新指定输入输出流
     *
    */

    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            bufferedReader = new BufferedReader(inputStreamReader);

            while (true){
                System.out.print("请输入字符串：");
                String data = bufferedReader.readLine();

                if (data.equalsIgnoreCase("e") || data.equalsIgnoreCase("exit")){
                    System.out.println("程序结束");
                    break;
                }
                String string = data.toUpperCase();
                System.out.println(string);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader!=null){
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }




}