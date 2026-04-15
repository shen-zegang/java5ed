package com.boda.xy;
import java.io.File;
import java.net.MalformedURLException;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.*;
public final class FileChooserDemo extends Application {
    private Label label = new Label("");
    @Override
    public void start(final Stage stage) {    
        final FileChooser fileChooser = new FileChooser(); 
        fileChooser.setTitle("查看图片");
        fileChooser.setInitialDirectory( 
            new File(System.getProperty("user.home"))); 
        fileChooser.getExtensionFilters().addAll(
             new FileChooser.ExtensionFilter("All Images", "*.*"),
             new FileChooser.ExtensionFilter("JPG", "*.jpg"),
             new FileChooser.ExtensionFilter("PNG", "*.png")
        );
        //创建菜单条、菜单和菜单项
        MenuBar menuBar = new MenuBar();
        Menu fileMenu = new Menu("文件"); 
        MenuItem openMenuItem = new MenuItem("打开");
        MenuItem exitMenuItem = new MenuItem("退出");
        fileMenu.getItems().addAll(openMenuItem,exitMenuItem);
         menuBar.getMenus().addAll(fileMenu);
        //为打开菜单注册事件处理器
        openMenuItem.setOnAction(
            (final ActionEvent e) -> {
                File file = fileChooser.showOpenDialog(stage);
                if (file != null) {
                    openFile(file);
                }
        });
        //创建主界面
        final HBox pane = new HBox();
        pane.setAlignment(Pos.CENTER);
        pane.getChildren().add(label);   
        final BorderPane rootNode = new BorderPane();
        rootNode.setTop(menuBar);        
        rootNode.setCenter(pane);
        stage.setTitle("文件对话框示例");
        stage.setScene(new Scene(rootNode,300,100));
        stage.show();
    }
    //打开文件方法 
    private void openFile(File file) {
    	   String localUrl=null;
      	try{
    	      localUrl = file.toURI().toURL().toString();   
    	   }catch(MalformedURLException mue){
    	     System.out.println(mue);
    	  }
    	  Image localImage = new Image(localUrl, false);
    	  ImageView imageView = new ImageView(localImage);
	  label.setGraphic(imageView);
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
