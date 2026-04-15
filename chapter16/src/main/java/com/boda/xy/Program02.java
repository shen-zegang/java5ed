package com.boda.xy;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene; 
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage; 
public class Program02 extends Application {
    Text text = new Text("This is a String");
    Button big = new Button("放大"),
           small = new Button("缩小");
	@Override
    public void start(Stage stage) {	  
	   // 为“取消”按钮注册事件处理器
	   big.setOnAction(e->{
    	  double size = text.getFont().getSize();
    	  size = size +2;
    	  text.setFont(new Font(size));
      });
 	  // 为“取消”按钮注册事件处理器
	  small.setOnAction(e->{
	    	  double size = text.getFont().getSize();
	    	  size = size -2;
	    	  text.setFont(new Font(size));
	      });        
	  HBox hbox = new HBox();
	  hbox.getChildren().addAll(big,small);
	  hbox.setAlignment(Pos.CENTER);
	  hbox.setSpacing(20);
	  hbox.setPadding(new Insets(5,20,20,20));
	  
	  BorderPane root = new BorderPane();
      root.setCenter(text);
      root.setBottom(hbox);     
      Scene scene = new Scene(root, 280, 100);
      stage.setTitle("AtionEvent事件处理");
      stage.setScene(scene);
      stage.show();
   }
   public static void main(String[] args) {
	      launch(args);
   }
}