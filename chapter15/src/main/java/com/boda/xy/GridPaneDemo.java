package com.boda.xy;
import module javafx.controls;

public class GridPaneDemo extends Application {   
	public void start(Stage stage) {
	    Label label1 = new Label("用户名"),
	            label2 = new Label("口   令");
	     TextField field1 = new TextField();
	     PasswordField field2 = new PasswordField();
	     Button ok = new Button("确定"),  cancel = new Button("取消");
	     //创建一水平控件框，并添加两个按钮
	     HBox hb = new HBox();
	     hb.setSpacing(20);
	     hb.setPadding(new Insets(10, 20, 10, 20));
	     hb.getChildren().addAll(ok,cancel);
	     //创建根面板
	     GridPane rootNode = new GridPane();
	     rootNode.setHgap(5);
	     rootNode.setVgap(5);
	     rootNode.setPadding(new Insets(10, 10, 10, 10));
	     //向网格面板中添加控件
	     rootNode.add(label1, 0, 0);
	     rootNode.add(label2, 0, 1);
	     rootNode.add(field1, 1, 0);
	     rootNode.add(field2, 1, 1);
	     rootNode.add(hb, 0, 2,2,1);
	     rootNode.setGridLinesVisible(true);    //显示网格线
	     
	     Scene scene = new Scene(rootNode, 300, 150);
	     stage.setTitle("用户登录");
	     stage.setScene(scene);
	     stage.show();

	}


   public static void main(String[] args) {
      launch(args);
   }
}
