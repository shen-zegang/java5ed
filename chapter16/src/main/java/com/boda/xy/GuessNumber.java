package com.boda.xy;

import java.util.Optional;
import module javafx.controls;
//
//import javafx.application.Application;
//import javafx.application.Platform;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.scene.Scene;
//import javafx.scene.control.Alert;
//import javafx.scene.control.Button;
//import javafx.scene.control.ButtonBar;
//import javafx.scene.control.ButtonType;
//import javafx.scene.control.TextInputDialog;
//import javafx.scene.layout.BorderPane;
//import javafx.stage.Stage;

public class GuessNumber extends Application {  
    @Override
    public void start(Stage stage) {
        Button btn = new Button("开始猜数"); 
    	BorderPane dialogPane = new BorderPane();
    	dialogPane.setCenter(btn);
    	   // 创建一个输入对话框  
        TextInputDialog textDialog = new TextInputDialog("");
        textDialog.setTitle("猜数游戏");
        textDialog.setHeaderText("我想出一个1-100之间的数，请你猜！");
    	   textDialog.setContentText("你猜的数是");
        // 设置按钮的单击事件
        btn.setOnAction(new EventHandler<ActionEvent>() { 
            @Override
            public void handle(ActionEvent arg0) { // 处理单击事件
             	int magic=(int)(Math.random()*100)+1;
       		    Optional<String> ss = textDialog.showAndWait();
       		    String s = ss.get();
       		    int guess = Integer.parseInt(s);
       		    while(guess != magic ){
       	           if(guess > magic) {
       	        	   textDialog.setHeaderText("你猜的数太大，请重猜！");
       	           }else {
       	        	   textDialog.setHeaderText("你猜的数太小，请重猜！");
       	          }
       	          ss = textDialog.showAndWait();
       	          s = ss.get();
       	    		guess = Integer.parseInt(s);
                }
                // 创建一个确认对话框
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION); 
                // 设置对话框的头部文本
                alert.setHeaderText("恭喜你，答对了！该数是"+magic);             
                alert.setContentText("你继续猜吗？");// 设置对话框的内容文本
                // 显示对话框，并等待按钮返回
                Optional<ButtonType> buttonType = alert.showAndWait();
                // 判断返回的按钮类型是确定还是取消，再据此分别进一步处理
                // 单击了确定按钮OK_DONE
               if (buttonType.get().getButtonData().equals(
                       ButtonBar.ButtonData.OK_DONE)) { 
                   ;        // 返回主界面
                } else { // 单击了取消按钮CANCEL_CLOSE
                    Platform.exit();     // 强制结束程序运行
                }               
            }
        });   	
        Scene scene = new Scene(dialogPane, 240, 100);
        stage.setTitle("猜数游戏");
        stage.setScene(scene);
        stage.show();
    }    
    public static void main(String[] args) {
	      launch(args);
    }
}

