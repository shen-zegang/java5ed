package com.boda.xy;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class GUIClient extends Application implements Runnable {
	DatagramSocket socket;
	TextArea textArea = new TextArea("客户端已启动");
	public void start(Stage stage) {
		textArea.setFont(new Font("楷体", 16));
		textArea.setWrapText(true);
		ScrollPane scrollPane = new ScrollPane(textArea);
		final TextField message = new TextField();
		final Button send = new Button("发送");
		final Button exit = new Button("退出");
		HBox hbox = new HBox();
		hbox.setPadding(new Insets(15, 12, 15, 12));
		hbox.setSpacing(10);
		hbox.getChildren().addAll(message, send, exit);
		BorderPane rootNode = new BorderPane();
		rootNode.setCenter(scrollPane);
		rootNode.setBottom(hbox);
		send.setOnAction((ActionEvent e) -> {
			try {
				String data = message.getText();
				DatagramPacket packet = new DatagramPacket(data.getBytes(), data.length(), InetAddress.getLocalHost(),
						9898);
				socket.send(packet);
				if (message.equals("bye"))
					System.exit(0);
			} catch (Exception se) {
				System.out.println(se);
			}
			message.setText("");
		});
		exit.setOnAction((ActionEvent e) -> {
			try {
				socket.close();
			} catch (Exception ex) {
				System.out.println(ex);
			}
			System.exit(1);
		});
		Scene scene = new Scene(rootNode, 400, 150);
		stage.setScene(scene);
		stage.setTitle("客户端程序");
		stage.show();
		new Thread(this).start();
	}
	public void run() {
		try {
			byte[] buf = new byte[1024];
			DatagramPacket packet = new DatagramPacket(buf, 1024);
			socket = new DatagramSocket(5555);
			while (true) {
				socket.receive(packet);
				String data = new String(buf, 0, packet.getLength());
				if (data.toLowerCase().equals("bye"))
					break;
				textArea.appendText("\r\n服务器说:" + data);
			}
		} catch (IOException ex) {
			System.err.println(ex);
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		launch(args);
	}
}
