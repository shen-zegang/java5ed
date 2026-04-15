package com.boda.xy;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.stage.FileChooser;
public class Task1 extends Application {
    @Override
    public void start(Stage stage) {
	    FileChooser fileChooser = new FileChooser();    	
	    HBox hbox = new HBox();
        hbox.setPadding(new Insets(15, 12, 15, 12));
        hbox.setSpacing(10); 
        // 设置控件框的样式
        hbox.setStyle("-fx-background-color:#336699;");    
        //创建两个按钮并把它们添加到水平控件框中
        TextField tf1 = new TextField();
        tf1.setPrefSize(200, 20);        // 设置按钮的优先大小
        Button btn1 = new Button("打开文件");
        Button btn2 = new Button("上传");
        hbox.getChildren().addAll(tf1, btn1,btn2);
        btn1.setOnAction(e->{
	    	File file1 = fileChooser.showOpenDialog(stage);
	    	String filename;
	    	if(file1!=null){
	    	   filename = file1.toString();
	    	   tf1.setText(filename);
	    	}
	      });    
         btn2.setOnAction(e->{
	    	String filename = tf1.getText();
	    	byte[] value = new byte[1024];
	    	Socket socket;
	    	OutputStream os = null;	    	
	    	if(filename!=null){
	    	  try{
	    		  socket = new Socket("127.0.0.1",8089);
	    		  os = socket.getOutputStream();
	    		  FileInputStream file = new FileInputStream(filename);
	    		  int n;
	    		  while((n=file.read(value))!=-1){
	    			 os.write(value);  // 写出数据
	    		  }
	    		  os.flush();
	    		  os.close();
	    	  }catch(IOException ioe){	    		  
	    	  }
	    	  tf1.setText("文件上传完毕");
	    	}
	      });    
        Scene scene = new Scene(hbox, 400, 60);
        stage.setTitle("文件上传");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
       launch(args);
    }	
}

