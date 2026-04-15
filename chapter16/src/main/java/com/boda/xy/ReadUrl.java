package com.boda.xy;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebHistory;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
public class ReadUrl extends Application{
	public void start(Stage stage){
		HBox hbox = new HBox();
		final Label label = new Label("URL地址");
		final TextField url = new TextField();
		final Button ok = new Button("确定");
		final Button back = new Button("回退");
		
		url.setPrefWidth(320);
		hbox.getChildren().addAll(label,url,ok,back);
		hbox.setPadding(new Insets(10,10,10,10));
		hbox.setSpacing(10);
		
        final WebView browser = new WebView();
        final WebEngine webEngine = browser.getEngine();

        //ScrollPane scrollPane = new ScrollPane();
       // scrollPane.setContent(browser);
        
		
		BorderPane rootNode = new BorderPane();
		rootNode.setPadding(new Insets(10, 10, 10, 10));
		rootNode.setTop(hbox);
		rootNode.setCenter(browser);
		
		ok.setOnAction((ActionEvent e) -> {	
			String hostname = url.getText();
			webEngine.load(hostname);  //http://www.baidu.com			   
		});
		
		back.setOnAction((ActionEvent e) -> {	
			final WebHistory history = webEngine.getHistory();
			history.go(-1);
		});
		
	    Scene scene = new Scene(rootNode, 1000, 500);		
		stage.setScene(scene);
		stage.setTitle("简单的浏览器");
		stage.show();
	}
	public static void main(String[] args) {
	   launch(args);
	}
}

