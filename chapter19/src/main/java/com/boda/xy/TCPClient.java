package com.boda.xy;

import java.io.*;
import java.net.*;
import java.util.Scanner;
public class TCPClient{
  public static void main(String[] args){
     try(
       var socket = new Socket("127.0.0.1",8080);
       var is = new BufferedReader(
                       new InputStreamReader(socket.getInputStream()));
       var os = new PrintWriter(socket.getOutputStream());
       var input = new Scanner(System.in);
     ){ 
       IO.print("客户端:");
       var line = input.nextLine();   // 从键盘读一行数据
       while(!line.equals("bye")){
         os.println(line);       // 将数据发送到服务器
         os.flush();
         // 输出从服务器端读的一行数据
         IO.println("服务器端:"+is.readLine());
         IO.print("客户端:");
         line = input.nextLine();       // 从键盘读一行数据
       }
     }catch(Exception e){
        IO.println("发生异常:" + e);
     }
   }
}

