package com.boda.example;

import java.io.*;
import java.net.*;

public class FileServer {
    public static void main(String[] args) {
        int port = 12345;
        String saveDirectory = "uploaded_files";

        File dir = new File(saveDirectory);
        if (!dir.exists()) {
            dir.mkdir();
        }

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("服务器启动，等待客户端连接...");

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("客户端已连接，准备接收文件...");
                new Thread(new ClientHandler(socket, saveDirectory)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class ClientHandler implements Runnable {
    private Socket socket;
    private String saveDirectory;

    public ClientHandler(Socket socket, String saveDirectory) {
        this.socket = socket;
        this.saveDirectory = saveDirectory;
    }

    @Override
    public void run() {
        try (DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
             BufferedInputStream bufferedInputStream = new BufferedInputStream(socket.getInputStream())) {

            // 读取文件名的长度
            int fileNameLength = dataInputStream.readInt();
            if (fileNameLength <= 0) {
                System.out.println("无效的文件名长度");
                return;
            }

            // 读取文件名
            String fileName = dataInputStream.readUTF();
            System.out.println("接收到文件名: " + fileName);

            // 创建文件输出流
            FileOutputStream fileOutputStream = new FileOutputStream(saveDirectory + File.separator + fileName);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            byte[] buffer = new byte[4096];
            int bytesRead;

            // 读取文件内容并保存到本地
            while ((bytesRead = bufferedInputStream.read(buffer)) != -1) {
                bufferedOutputStream.write(buffer, 0, bytesRead);
            }

            bufferedOutputStream.flush();
            System.out.println("文件接收完成，保存在 '" + saveDirectory + File.separator + fileName + "'");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();  // 关闭客户端连接
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
