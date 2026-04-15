package com.boda.xy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
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

public class ChatClient extends Application implements Runnable{
	Socket socket;
	BufferedReader is;
	PrintWriter os;
	TextArea textArea = new TextArea("客户端已启动");
	
	public void start(Stage stage){
		textArea.setFont(new Font("楷体",16));
		textArea.setWrapText(true);
		ScrollPane scrollPane = new ScrollPane(textArea);
		final TextField message = new TextField();
		final Button send = new Button("发送");
		final Button exit = new Button("退出");
        
	    HBox hbox = new HBox();
         hbox.setPadding(new Insets(15, 12, 15, 12));
         hbox.setSpacing(10); 
        hbox.getChildren().addAll(message,send,exit);
		BorderPane rootNode = new BorderPane();
		rootNode.setCenter(scrollPane);
		rootNode.setBottom(hbox);
		send.setOnAction((ActionEvent e) -> {
		   os.println(message.getText());
		   os.flush();
		   message.setText("");	
		});
		exit.setOnAction((ActionEvent e) -> {
		   try{
			os.close();
		    is.close();
		    socket.close();
		  }catch(Exception ex){
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
	public void run(){
	  try{
		  socket = new Socket("localhost",9999);
	      is = new BufferedReader(
		               new InputStreamReader(socket.getInputStream()));
           os = new PrintWriter(socket.getOutputStream());
		  String s="";
	       while((s=is.readLine())!=null){
	    	    textArea.appendText("\r\n服务器说:"+s);
	  	  }
	  	}catch(IOException ex){
	  		System.err.println(ex);
	  	}	
	  }
	public static void main(String[] args) {
	   launch(args);
	}
}

