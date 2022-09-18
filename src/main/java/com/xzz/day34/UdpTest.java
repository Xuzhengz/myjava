package com.xzz.day34;

import org.junit.Test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @author 徐正洲
 * @date 2022/6/11-19:56
 */
public class UdpTest {

    @Test
    public void sender() throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();
        String st = "病毒";
        byte[] datas = st.getBytes();
        InetAddress localHost = InetAddress.getLocalHost();
        DatagramPacket datagramPacket = new DatagramPacket(datas,0,st.length(),localHost,8879);

        datagramSocket.send(datagramPacket);
        datagramSocket.close();

    }
    @Test
    public void receiver() throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(8879);
        byte[] datas = new byte[100];
        DatagramPacket datagramPacket = new DatagramPacket(datas, 0, datas.length);
        datagramSocket.receive(datagramPacket);
        System.out.println(new String(datagramPacket.getData(),0,datagramPacket.getLength()));

        datagramSocket.close();

    }
}