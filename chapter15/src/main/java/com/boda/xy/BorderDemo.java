package com.boda.xy;
//import module javafx.fxml;
import module javafx.controls;

public class BorderDemo extends Application{
   @Override
   public void start(Stage stage){
	   BorderPane rootNode = new BorderPane();
	   rootNode.setTop(new Button("上部工具条"));
	   rootNode.setLeft(new Button("左部菜单"));
	   rootNode.setCenter(new Button("中央区域"));
	   rootNode.setRight(new Button("右部"));
	   rootNode.setBottom(new Button("下部状态栏"));
	   
	   Scene scene = new Scene(rootNode, 300, 150);
	   stage.setScene(scene);
	   stage.setTitle("边界面板示例");
	   stage.show();

	  }
  public static void main(String[] args) {
    launch(args);
 }	
 
}