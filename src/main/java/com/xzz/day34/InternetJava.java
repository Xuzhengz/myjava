package com.xzz.day34;


import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author 徐正洲
 * @date 2022/6/11-16:53
 */
public class InternetJava {
    /**
     * 网络编程概述：程序员面对的是一个统一的网络编程环境
     * 目的：实现数据交换、进行通讯。
     * 对应问题1：ip和port
     * 对应问题2：网络通信协议
     *
     * Java中使用InetAddress类代表IP
     * IP分类：IPV4,IPV6
     * 实例化：InteAddress.getByName(String host),getLocalHost()
     *
     * 端口号：不同的进程对应不同的端口
     * 端口号和IP地址组合生成一个网络套接字：Socket
     */
    public static void main(String[] args) {
        InetAddress byName = null;
        try {
            byName = InetAddress.getByName("127.0.0.1");
            System.out.println(byName);
            byName = InetAddress.getByName("localhost");
            System.out.println(byName);
            //获取本机的名称和ip
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println(localHost);
            //获取本机名称
            System.out.println(localHost.getHostName());
            //获取本机ip
            System.out.println(localHost.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }

}