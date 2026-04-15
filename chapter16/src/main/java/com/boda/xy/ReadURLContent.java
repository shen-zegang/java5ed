package com.boda.xy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
public class ReadURLContent extends Application{
	public void start(Stage stage){
		HBox hbox = new HBox();
		final Label label = new Label("URL地址");
		final TextField url = new TextField();
		final Button ok = new Button("确定");
		url.setPrefWidth(320);
		hbox.getChildren().addAll(label,url,ok);
		hbox.setPadding(new Insets(10,10,10,10));
		hbox.setSpacing(10);
		final TextArea area = new TextArea();
		ScrollPane scrollPane = new ScrollPane(area);
		BorderPane rootNode = new BorderPane();
		rootNode.setPadding(new Insets(10, 10, 10, 10));
		rootNode.setTop(hbox);
		rootNode.setCenter(scrollPane);
		ok.setOnAction((ActionEvent e) -> {	
			String hostname = url.getText();
			String text = "";
			try{
			   URL myUrl = new URL(hostname);
			   BufferedReader in = new BufferedReader(
					   new InputStreamReader(myUrl.openStream()));
			   String inputLine;
			   while((inputLine=in.readLine())!=null){
				   text = text + "\n" +inputLine; 
			   }
			   area.appendText(text);
			}catch(UnknownHostException|MalformedURLException ex){
				area.setText("URL不正确或资源不存在");
			}catch(IOException ioex){
				area.setText("URL不正确或资源不存在");
			}
		});
	    Scene scene = new Scene(rootNode, 500, 250);		
		stage.setScene(scene);
		stage.setTitle("读取URL资源");
		stage.show();
	}
	public static void main(String[] args) {
	   launch(args);
	}
}
