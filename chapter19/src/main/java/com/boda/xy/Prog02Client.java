package com.boda.xy;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Prog02Client {
public static void  main(String[]args){
    try(
      Socket socket = new Socket("localhost",8000);
      DataInputStream isFromServer = new DataInputStream(
   		      socket.getInputStream());
      DataOutputStream osToServer = new DataOutputStream(
   		   socket.getOutputStream());    
      Scanner sc = new Scanner(System.in);
     ){  
      System.out.print("请输入半径值:"); 
      double radius = sc.nextDouble();
      osToServer.writeDouble(radius);
      osToServer.flush();
      double area = isFromServer.readDouble();
      System.out.println("接收到的面积是:"+area);
    }catch(IOException ex){
       System.err.println(ex);
    }
  }
}