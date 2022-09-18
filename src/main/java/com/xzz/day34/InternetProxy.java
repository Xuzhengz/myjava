package com.xzz.day34;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author 徐正洲
 * @date 2022/6/11-17:10
 * <p>
 * 网络协议：TCP\UDP
 * TCP:
 * 1）先建立TCP连接，形成传输数据通道
 * 2）采用”三次握手“方式，点对点通信，是可靠的
 * 3）可进行大数据量的传输，传输完毕，需要释放已建立的连接，效率低
 * <p>
 * UDP：
 * 1）不需要建立连接
 * 2）每个包限制在64K内
 * 3）无需释放资源，开销小，速度快
 * 4）只管发送数据
 */
public class InternetProxy {
    /**
     * 实现TCP网络编程
     * <p>
     * 例1：客户端发送信息给服务器，服务器将数据显示在控制台。
     */
    @Test
    public void client() {
        Socket localhost = null;
        OutputStream outputStream = null;
        try {
            localhost = new Socket(InetAddress.getByName("localhost"), 8879);

            outputStream = localhost.getOutputStream();

            outputStream.write("你好我是徐正洲".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (localhost != null) {
                try {
                    localhost.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

        }


    }

    @Test
    public void server() {

        ServerSocket serverSocket = null;
        InputStream inputStream = null;
        Socket accept = null;
        ByteArrayOutputStream byteArrayOutputStream = null;

        try {
            serverSocket = new ServerSocket(8879);
            accept = serverSocket.accept();
            inputStream = accept.getInputStream();
            byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bytes = new byte[5];
            int len;
            while ((len = inputStream.read(bytes)) != -1) {
                byteArrayOutputStream.write(bytes, 0, len);
            }
            System.out.println(byteArrayOutputStream);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (accept != null) {
                try {
                    accept.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        }


    }
}