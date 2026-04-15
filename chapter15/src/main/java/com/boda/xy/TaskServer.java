package com.boda.xy;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TaskServer{
	   public static void  main(String[]args) throws IOException{
	      ServerSocket serverSocket = new ServerSocket(8089);
	      FileOutputStream fos = null;
	      try{
	        System.out.println("服务器程序启动，开始接收客户的请求");
	        Socket socket = serverSocket.accept();
	        InetAddress clientAddress = socket.getInetAddress();
	        System.out.println("客户的主机名是 "
	                          +clientAddress.getHostName());
	    	   InputStream is = socket.getInputStream();
	        byte[] value = new byte[1024];
	        fos = new FileOutputStream("D:\\file.dat");
	    	   int n = 0;
	        while((n = is.read(value))!=-1){
	    	       fos.write(value);
	    	   } 
	    	   fos.flush();
	      }catch(IOException ioe){
	    	   
	      }finally{
	    	    fos.close(); 
	    	    serverSocket.close();
	      }
	   }  
	}  

