package com.xzz.day34;

import org.junit.Test;

import java.io.*;

/**
 * @author 徐正洲
 * @date 2022/6/11-12:44
 */
public class ObjectInputstreamTest {
    /**
     * 对象流：ObjectInputstream、ObjectOputstream：用于存储和读取基本数据类型数据或对象的处理流，用于对象的传输
     * 1）不能序列化static、transient
     * 2）序列化：用ObjectOputstream 保存基本数据类型数据和对象
     * 3）反序列化：用ObjectInputstream 读取保存基本数据类型数据和对象
     * 4）传输对象所属类需要实现Serializable、Externalizable，且成员属性也需要支持序列化，默认基本数据类型支持序列化。
     * 5）可将任何实现了序列化接口的对象转为字节数据
     *
     *
     */

    /**
     * 序列化：用ObjectOputstream，以字节数据的方式输出到文件
     */
    @Test
    public void test() {
        ObjectOutputStream objectOutputStream = null;
        try {
//        1、创建对象流
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("src\\main\\resources\\11.txt"));
//        2、写出操作
            objectOutputStream.writeObject("我爱徐正洲");
//        3、刷写数据
            objectOutputStream.flush();

//        2、写出操作
            objectOutputStream.writeObject(new Person("徐正洲",12));
//        3、刷写数据
            objectOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (objectOutputStream != null) {
                //        4、关闭资源
                try {
                    objectOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 反序列化数据：以字节数据读取ObjectInputstream
     */
    @Test
    public void test2() {
        ObjectInputStream objectInputStream = null;
        try {
//        1、创建对象流
            objectInputStream = new ObjectInputStream(new FileInputStream("src\\main\\resources\\11.txt"));
//        2、写出操作
            try {
                Object object = objectInputStream.readObject();
                String datas = (String) object;
                System.out.println(datas);
                System.out.println(objectInputStream.readObject());
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (objectInputStream != null) {
                //        4、关闭资源
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}