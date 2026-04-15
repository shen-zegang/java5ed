package com.boda.xy;
import java.net.InetAddress;
import java.net.UnknownHostException;
public class Program01 {
	public static void main(String[] args) {
		String hostname = "www.baidu.com";
		try{
		  InetAddress[] addresses = InetAddress.getAllByName(hostname);
		  System.out.println("主机名："+addresses[0].getHostName());
		  for(InetAddress add : addresses){
		     System.out.println("IP地址："+add.getHostAddress());
		  }
		}catch(UnknownHostException ex){
		  System.out.println("给定的主机不存在");
		}
	}
}
