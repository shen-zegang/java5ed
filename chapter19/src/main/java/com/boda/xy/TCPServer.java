package com.boda.xy;

import java.io.*;
import java.net.*;
import java.util.Scanner;
public class TCPServer{
   public static void main(String[] args){
     try(
       var server = new ServerSocket(8080);
       var socket = server.accept();
       var is = new BufferedReader(
                   new InputStreamReader(socket.getInputStream()));
       var os = new PrintWriter(socket.getOutputStream());
       var input = new Scanner(System.in);
      ){ 
       IO.println("客户端:"+is.readLine()); // 显示从客户端读的数据
       IO.print("服务器端:");
       var line = input.nextLine(); // 从键盘读一行数据
       while(!line.equals("bye")){
         os.println(line); // 将数据发送到客户端
         os.flush();
         IO.println("客户端:"+is.readLine()); // 显示从客户端读的数据
         IO.print("服务器端:");
         line = input.nextLine();         // 从键盘读一行数据
       }
     }catch(Exception e){
        IO.println("发生异常:" + e);
     }
   }
}

