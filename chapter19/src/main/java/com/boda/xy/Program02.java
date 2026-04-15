package com.boda.xy;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
public class Program02 {
	public static void main(String[] args) {
		try (ServerSocket serverSocket = new ServerSocket(8000);
				Socket socket = serverSocket.accept();
				DataInputStream isFromClient = new DataInputStream(socket.getInputStream());
				DataOutputStream osToClient = new DataOutputStream(socket.getOutputStream());) {
			System.out.println("服务器已启动...");
			double radius = isFromClient.readDouble();
			System.out.println("接收的半径值:" + radius);
			double area = radius * radius * Math.PI;
			osToClient.writeDouble(area);
			osToClient.flush();
			System.out.println("面积:" + area);
		} catch (IOException ex) {
			System.err.println(ex);
		}
	}
}
