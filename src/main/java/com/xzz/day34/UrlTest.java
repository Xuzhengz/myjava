package com.xzz.day34;

import com.xzz.day03.Kids;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author 徐正洲
 * @date 2022/6/11-20:11
 * <p>
 * URL:统一资源定位符
 * 格式：<传输协议>://<主机名>:<端口号>/<文件名>?<参数列表>
 */
public class UrlTest {
    public static void main(String[] args) throws IOException {

        URL url = new URL("http://localhost:8888/securityWeb/login.html");

        System.out.println(url.getProtocol());

        System.out.println(url.getHost());

        System.out.println(url.getPort());

        System.out.println(url.getPath());

        System.out.println(url.getFile());

        System.out.println(url.getQuery());

        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        urlConnection.connect();
        InputStream inputStream = urlConnection.getInputStream();
        FileOutputStream fileOutputStream = new FileOutputStream("src\\main\\resources\\2.html");

        byte[] datas = new byte[1024];
        int len;
        while ((len = inputStream.read(datas))!=-1){
            fileOutputStream.write(datas,0, len);
        }
        System.out.println("下载完成");

        fileOutputStream.close();
        inputStream.close();


    }
}