package com.xzz.day34;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 徐正洲
 * @date 2022/6/11-19:21
 * <p>
 * 例题2：客户端发送文件给服务器,服务器将文件保存在本地
 */
public class SocketTest {
    @Test
    public void client() {
        Socket localhost = null;
        OutputStream outputStream = null;
        FileInputStream fileInputStream = null;
        try {
            localhost = new Socket(InetAddress.getByName("localhost"), 8879);
            outputStream = localhost.getOutputStream();

            fileInputStream = new FileInputStream(new File("src\\main\\resources\\01.png"));

            byte[] datas = new byte[1024];
            int len;
            while ((len = fileInputStream.read(datas)) != -1) {
                outputStream.write(datas, 0, len);
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
        Socket accept = null;
        InputStream inputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            serverSocket = new ServerSocket(8879);
            accept = serverSocket.accept();
            inputStream = accept.getInputStream();

            fileOutputStream = new FileOutputStream(new File("src\\main\\resources\\03.png"));
            byte[] datas = new byte[1024];
            int len;
            while ((len = inputStream.read(datas)) != -1) {
                fileOutputStream.write(datas, 0, len);
            }
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

        }


    }
}