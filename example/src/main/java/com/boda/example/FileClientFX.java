package com.boda.example;

import javafx.application.Application;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import java.io.*;
import java.net.*;

public class FileClientFX extends Application {

    private static final String SERVER_ADDRESS = "localhost";
    private static final int SERVER_PORT = 12345;

    private Label statusLabel;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("文件上传客户端");

        Button uploadButton = new Button("选择文件并上传");
        statusLabel = new Label();
        statusLabel.setStyle("-fx-text-fill: green;");

        uploadButton.setOnAction(e -> {
            File file = showFileChooser(primaryStage);
            if (file != null) {
                uploadFile(file);
            }
        });

        VBox vbox = new VBox(10, uploadButton, statusLabel);
        vbox.setAlignment(Pos.CENTER);

        Scene scene = new Scene(vbox, 300, 150);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private File showFileChooser(Stage ownerStage) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("所有文件", "*.*"));
        return fileChooser.showOpenDialog(ownerStage);
    }

    private void uploadFile(File file) {
        try (Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT)) {
            OutputStream outputStream = socket.getOutputStream();
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);

            FileInputStream fileInputStream = new FileInputStream(file);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

            String fileName = file.getName();

            // 使用 DataOutputStream 发送文件名长度和文件名
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            dataOutputStream.writeInt(fileName.length());  // 先发送文件名长度
            dataOutputStream.writeUTF(fileName);  // 然后发送文件名
            dataOutputStream.flush();

            byte[] buffer = new byte[4096];
            int bytesRead;

            // 发送文件内容
            while ((bytesRead = bufferedInputStream.read(buffer)) != -1) {
                bufferedOutputStream.write(buffer, 0, bytesRead);
            }

            bufferedOutputStream.flush();
            // 更新标签，显示文件名和上传成功消息
            updateStatusLabel(fileName + " 文件上传成功！");
            bufferedInputStream.close();
            bufferedOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
            updateStatusLabel("文件上传失败！");
        }
    }

    private void updateStatusLabel(String message) {
        statusLabel.setText(message);
    }
}
