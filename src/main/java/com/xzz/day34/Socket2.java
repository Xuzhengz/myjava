package com.xzz.day34;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 徐正洲
 * @date 2022/6/11-19:31
 *
 * 例题3：从客户端发送文件服务器，服务器保存本地，服务器接收成功回应
 */
public class Socket2 {
    @Test
    public void client() {
        Socket localhost = null;
        OutputStream outputStream = null;
        FileInputStream fileInputStream = null;
        InputStream inputStream = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            localhost = new Socket(InetAddress.getByName("localhost"), 8879);
            outputStream = localhost.getOutputStream();

            fileInputStream = new FileInputStream(new File("src\\main\\resources\\01.png"));

            byte[] datas = new byte[1024];
            int len;
            while ((len = fileInputStream.read(datas)) != -1) {
                outputStream.write(datas, 0, len);
            }

            localhost.shutdownOutput();


            //接收服务器的回应打应到控制台上

            inputStream = localhost.getInputStream();
            byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] messages = new byte[1024];
            int length;
            while ((length = inputStream.read(messages)) != -1) {
                byteArrayOutputStream.write(messages, 0, length);
            }
            System.out.println(byteArrayOutputStream);
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
            if (inputStream!=null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (byteArrayOutputStream!=null){
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        }


    }

    @Test
    public void server() {
        ServerSocket serverSocket = null;
        Socket accept = null;
        InputStream inputStream = null;
        FileOutputStream fileOutputStream = null;
        OutputStream outputStream = null;
        try {
            serverSocket = new ServerSocket(8879);
            accept = serverSocket.accept();
            inputStream = accept.getInputStream();

            fileOutputStream = new FileOutputStream(new File("src\\main\\resources\\04.png"));
            byte[] datas = new byte[1024];
            int len;
            while ((len = inputStream.read(datas)) != -1) {
                fileOutputStream.write(datas, 0, len);
            }

            //反馈：
            outputStream = accept.getOutputStream();
            outputStream.write("你好，我已经接收到数据".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
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
            if (accept != null) {
                try {
                    accept.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            if (outputStream!=null){
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }


    }
}