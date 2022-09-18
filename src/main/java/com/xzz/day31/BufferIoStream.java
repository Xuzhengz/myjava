package com.xzz.day31;

import org.junit.Test;

import java.io.*;

/**
 * @author 徐正洲
 * @create 2022-06-08 14:43
 * <p>
 * 缓冲流（处理流的一种）
 * 1）缓冲字节流：BufferInputStream、BufferOutputStream
 * 2）缓冲字符流：BufferReader、BufferWriter
 * <p>
 * 作用：提供流的读取、写入的速度
 * 原因：内部提供了一个缓冲区
 * <p>
 * 处理流：套接在已有的流之上
 */
public class BufferIoStream {
    /**
     * 实现非文本文件的复制
     */
    @Test
    public void test() {
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
//        1、提供file
            File file1 = new File("D:\\Idea2020\\java\\src\\main\\resources\\01.png");
            File file2 = new File("D:\\Idea2020\\java\\src\\main\\resources\\02.png");

//        2、造流
//        1)造节点流
            FileInputStream fileInputStream = new FileInputStream(file1);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
//        2）造缓冲流
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
//        3、操作
            byte[] data = new byte[10];
            int len;
            while ((len = bufferedInputStream.read(data)) != -1) {
                bufferedOutputStream.write(data, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //        4、关闭:关闭外层流，内层流自动关闭
            if (bufferedInputStream != null) {
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            if (bufferedOutputStream != null) {
                try {
                    bufferedOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
//        fileInputStream.close();
//        fileOutputStream.close();
        }


    }

    public void copyForBuffer(String input, String output) {
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
//        1、提供file
            File file1 = new File(input);
            File file2 = new File(output);

//        2、造流
//        1)造节点流
            FileInputStream fileInputStream = new FileInputStream(file1);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
//        2）造缓冲流
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
//        3、操作
            byte[] data = new byte[1024];
            int len;
            while ((len = bufferedInputStream.read(data)) != -1) {
                bufferedOutputStream.write(data, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //        4、关闭:关闭外层流，内层流自动关闭
            if (bufferedInputStream != null) {
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            if (bufferedOutputStream != null) {
                try {
                    bufferedOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
//        fileInputStream.close();
//        fileOutputStream.close();
        }

    }

    @Test
    public void test2() {

        long start = System.currentTimeMillis();
        String input = "D:\\Idea2020\\java\\src\\main\\resources\\01.png";
        String output = "D:\\Idea2020\\java\\src\\main\\resources\\03.png";
        copyForBuffer(input, output);
        long end = System.currentTimeMillis();
        System.out.println("所花费的时间：" + (end - start) + "ms");


    }


    /**
     * BufferReader\Writer 处理文本文件
     */
    @Test
    public void test3() {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
//        1、提供文件
            bufferedReader = new BufferedReader(new FileReader("src\\main\\resources\\smalltable"));
            bufferedWriter = new BufferedWriter(new FileWriter("src\\main\\resources\\smalltable2"));
//        2、读写操作
//            char[] datas = new char[1024];
//            int len;
//            while ((len = bufferedReader.read(datas)) != -1) {
//                bufferedWriter.write(datas,0,len);
//            }
//            方式二：
            String datas;
            while ((datas = bufferedReader.readLine()) != null) {
                bufferedWriter.write(datas );
                bufferedWriter.newLine();//提供换行的操作
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //        3、关闭操作
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }


    }

}
