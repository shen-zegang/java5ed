package com.boda.xy;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class MenuDemo extends Application {
    @Override
    public void start(Stage primaryStage) {
       BorderPane rootNode = new BorderPane();
       TextArea textArea = new TextArea();
       MenuBar menuBar = new MenuBar();
       rootNode.setTop(menuBar);
       rootNode.setCenter(textArea);
       // 文件菜单
       Menu fileMenu = new Menu("文件(_F)");
       fileMenu.setMnemonicParsing(true);
       MenuItem newMenuItem = new MenuItem("新建",
              new ImageView(new Image(getClass().getResourceAsStream("/images/new.gif"))));
       MenuItem openMenuItem = new MenuItem("打开");
       // 为菜单项设置快捷键
       openMenuItem.setAccelerator(
           KeyCombination.keyCombination("Ctrl+O"));
       // 为菜单项添加图标
       openMenuItem.setGraphic(new ImageView(
            new Image(getClass().getResourceAsStream("/images/open.gif"))));
       MenuItem saveMenuItem = new MenuItem("保存");
       MenuItem exitMenuItem = new MenuItem("退出");
       exitMenuItem.setOnAction(actionEvent -> Platform.exit() );
       exitMenuItem.setAccelerator(
             KeyCombination.keyCombination("Ctrl+X"));
       fileMenu.getItems().addAll(newMenuItem,  openMenuItem,
            saveMenuItem, new SeparatorMenuItem(), exitMenuItem
       );
       // 字体菜单
       Menu fontMenu = new Menu("字体");
       CheckMenuItem font1MenuItem = new CheckMenuItem("粗体");
       font1MenuItem.setGraphic(new ImageView(
                      new Image(getClass().getResourceAsStream("/images/bold.png"))));
       font1MenuItem.setSelected(true);
       CheckMenuItem font2MenuItem = new CheckMenuItem("斜体");
       font2MenuItem.setGraphic(new ImageView(
                new Image(getClass().getResourceAsStream("/images/italic.png"))));
       font2MenuItem.setSelected(true);
       fontMenu.getItems().addAll(font1MenuItem,font2MenuItem);
       // 颜色菜单
       Menu colorMenu = new Menu("颜色");
       ToggleGroup tGroup = new ToggleGroup();
       RadioMenuItem redItem = new RadioMenuItem("红色");
       redItem.setToggleGroup(tGroup);
       RadioMenuItem greenItem = new RadioMenuItem("绿色");
       greenItem.setToggleGroup(tGroup);
       greenItem.setSelected(true);
       RadioMenuItem blueItem = new RadioMenuItem("蓝色");
       blueItem.setToggleGroup(tGroup);
       colorMenu.getItems().addAll(redItem,greenItem,blueItem,
           new SeparatorMenuItem());
       // 特效菜单二级子菜单
       Menu effectMenu = new Menu("特效");
       effectMenu.getItems().addAll(new CheckMenuItem("阴影效果"),
    		   new CheckMenuItem("模糊效果"),new CheckMenuItem("发光效果"));
       colorMenu.getItems().add(effectMenu);
       // 将菜单添加到菜单条上
       menuBar.getMenus().addAll(fileMenu, fontMenu, colorMenu);
       // 弹出菜单定义
       MenuItem copyMenuItem = new MenuItem("复制");
       ContextMenu contextFileMenu = new ContextMenu();
       contextFileMenu.getItems().addAll(copyMenuItem,exitMenuItem);
       // 为菜单项注册事件处理器
       openMenuItem.setOnAction(e->{
    	       textArea.setText("你选择了打开文件菜单");}
       );
       exitMenuItem.setOnAction(new EventHandler<ActionEvent>() {
    	      @Override
              public void handle(ActionEvent t) {
    	              Platform.exit();
    	      }
    	   });
       // 为弹出菜单注册事件处理器
       primaryStage.addEventHandler(MouseEvent.MOUSE_CLICKED, 
(MouseEvent me) -> {
    	 if (me.getButton() == MouseButton.SECONDARY || me.isControlDown()) 
{
    	       // 显示弹出菜单
    		 contextFileMenu.show(rootNode, me.getScreenX(), me.getScreenY());
    	      } else {
    	         contextFileMenu.hide();   // 隐藏弹出菜单  
    	      }
      });
      // 设置界面场景
      Scene scene = new Scene(rootNode, 300, 150, Color.WHITE);
      primaryStage.setTitle("菜单实例");
      primaryStage.setScene(scene);
      primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
