package com.xzz.day31;

import org.junit.Test;

import java.io.*;

/**
 * @author 徐正洲
 * @date 2022/6/7-19:23
 * <p>
 * IO流：
 * 1）按数据单位：字节流(8 bit) 、 字符流(16 bit)
 * 2）按流向：输入流、输出流
 * 3）按角色：节点流、处理流
 * <p>
 * 字节流：InputStream、OutputStream
 * 字符流：Reader、Writer
 * <p>
 * 节点流：FileInputStream、FileOutputStream、FileReader、FileWriter
 * 处理流（缓冲流）：BufferInputStream、BufferOutputStream、BufferReader、BufferWriter
 */
public class FileReaderTest {
    /**
     * 读取文件数据，写出到控制台
     */
    @Test
    public void test() throws IOException {
        java.io.FileReader fileReader = null;
        try {
            File file = new File("src\\main\\resources\\xzz.properties");
            fileReader = new java.io.FileReader(file);
            //返回读入的字符，如果达到文件末尾，返回-1.
            int data;
//        while (data !=-1){
//            System.out.print((char)data);
//            data = fileReader.read();
//        }
            while ((data = fileReader.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
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

    /**
     * read方法的重载:char[] 定义每次读取的数据长度
     */
    @Test
    public void test1() throws IOException {
        java.io.FileReader fileReader = null;
        try {
//        1、file类的实例化
            File file = new File("src\\main\\resources\\xzz.properties");
//        2、流的实例化
            fileReader = new java.io.FileReader(file);
//        3、读入的操作
            char[] data = new char[5];
            int read;
            while ((read = fileReader.read(data)) != -1) {
                for (int i = 0; i < read; i++) {
                    System.out.print(data[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                //        4、资源的关闭
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * FileWriter:写出数据到文件
     */

    @Test
    public void test2() throws IOException {
//        1、提供一个文件路径，可存在，可不存在，默认构造器是覆盖，可以使用重载构造器追加数据
        File file = new File("src\\main\\resources\\xzz2.properties");
//        2、流的实例化
        FileWriter fileWriter = new FileWriter(file);
//        3、写出的操作
        fileWriter.write(new String("xuzz"));
//        4、关闭资源
        fileWriter.close();
    }

    /**
     * 文件读取和输出
     */
    @Test
    public void test4() throws IOException {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
//        1、提供file
            File file = new File("src\\main\\resources\\xzz.properties");
            File file2 = new File("src\\main\\resources\\xzz3.properties");
//        2、创建输入输出流
            fileReader = new FileReader(file);
            fileWriter = new FileWriter(file2);
//        3、读取和输出操作
            char[] data = new char[5];
            int read;
            while ((read = fileReader.read(data)) != -1) {
                fileWriter.write(data, 0, read);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //        4、关闭资源
            try {
                if (fileReader != null && fileWriter != null) {
                    fileReader.close();
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }

}