package com.xzz.day30;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author 徐正洲
 * @date 2022/6/6-19:53
 *
 * IO流：持久化数据
 *
 */
public class IOTest {
    /**
    *1、File类：对象代表一个文件或者目录。
    *2、声明在java.io下
     *
     * 相对路径：（module下的路径）src\\main\\resources\\xzz.properties
     * 绝对路径：C:\\Users\\xuzhengzhou\\IdeaProjects\\test\\myjava\\src\\main\\resources\\xzz.properties
     *
     * 3、路径分隔符：
     * windows: \\
     * linux：/
    */
    @Test
    public void test(){
        //构造器1：
        File file1 = new File("src\\main\\resources");
        System.out.println(file1);
        //构造器2：
        File file2 = new File("src\\main\\resources\\", "xzz.properties");
        System.out.println(file2);
        //构造器3：
        File file3 = new File(file1, "xzz.properties");
        System.out.println(file3);
    }

    /**
    * File的常用方法
     *
     * 1、获取：
     *
    *
    */
    @Test
    public void test2(){
        File file = new File("D:\\");
        String absolutePath = file.getAbsolutePath();
        System.out.println(absolutePath);
        File absoluteFile = file.getAbsoluteFile();
        System.out.println(absoluteFile);
        String name = file.getName();
        System.out.println(name);
        long length = file.length();
        System.out.println(length);
        boolean file1 = file.isFile();
        System.out.println(file1);
        boolean delete = file.delete();
        System.out.println(delete);
        String[] list = file.list();
        for (String string : list) {
            System.out.println(string);
        }
        File[] files = file.listFiles();
        for (File file2 : files) {
            System.out.println(file2);
        }
    }
    /**
    * 3、判断File：
     * isDirectory()
     * isFile()
     * exists()
     * canRead()
     * canExecute()
     * canWrite()
    *
    */
    @Test
    public void test3(){
        File file = new File("src\\main\\resources\\xzz.properties");

        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.exists());
        System.out.println(file.canRead());
        System.out.println(file.canExecute());
        System.out.println(file.canWrite());
    }
    /**
    * 4、创建|删除文件或目录
    *
    */
    @Test
    public void test4() throws IOException {
//        File xzz = new File("xzz");
//        if (!xzz.exists()){
//            xzz.createNewFile();
//            System.out.println("创建成功");
//        }else {
//            System.out.println("文件已存在");
//            xzz.delete();
//            xzz.createNewFile();
//        }
//        System.out.println(xzz.getAbsoluteFile());

        //目录的创建

        File file = new File("D:\\io2\\iotest");
        boolean mkdir = file.mkdirs();
        if (mkdir){
            System.out.println("创建成功");
        }
        boolean delete = file.delete();
        // 目录下不能有子目录或文件
        System.out.println("删除成功");

    }
    @Test
    public void exer(){


    }
}