package com.boda.xy;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer{
    void main(String[] args) {
        byte[] buf = new byte[1024];
        try {
            var socket = new DatagramSocket(8888);
            IO.println("服务器等待...");
            while (true) {
                //用于接收数据的数据报
                var packet = new DatagramPacket(buf, 1024);
                socket.receive(packet);
                var data = new String(buf, 0, packet.getLength());
                if (data.toLowerCase().equals("bye"))
                    break;
                IO.println("客户数据：" + data);
                var send = data.toUpperCase();
                var clientIP = packet.getAddress(); // 返回客户端的IP地址
                int clientPort = packet.getPort();  // 返回客户端的端口号
                byte[] msg = send.getBytes();
                //用于发送数据的数据报
                var sendPacket = new DatagramPacket(
                        msg, send.length(), clientIP, clientPort);
                socket.send(sendPacket);
            }
            socket.close();
            IO.println("服务器关闭！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


