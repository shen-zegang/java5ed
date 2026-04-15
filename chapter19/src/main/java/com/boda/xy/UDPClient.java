package com.boda.xy;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPClient{
    void main(String[] args) {
        byte[] bufsend = new byte[1024];
        try {
            var socket = new DatagramSocket();
            var input = new Scanner(System.in);
            while (true) {
                IO.print("请输入字符串：");
                var message = input.nextLine();
                bufsend = message.getBytes();
                //用于发送数据的数据报
                var packet = new DatagramPacket(
                        bufsend, message.length(), InetAddress.getLocalHost(), 8888);
                // InetAddress.getByName("182.168.0.1")
                socket.send(packet);
                if (message.equals("bye"))
                    break;
                //用于接收数据的数据报
                byte[] bufrec = new byte[1024];
                var receivePacket = new DatagramPacket(bufrec, bufrec.length);
                socket.receive(receivePacket);
                var received = new String(bufrec, 0, receivePacket.getLength());
                IO.println("从服务器返回的字符串：" + received);
            }
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


