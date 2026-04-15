package com.boda.xy;
import module javafx.controls;

public class RadioButtonDemo extends Application{
	public void start(Stage stage){
	    Label label = new Label("请选择你最喜欢的编程语言");
	    final ToggleGroup group = new ToggleGroup();
	    // 创建4个单选按钮，并将它们添加到按钮组中
	    RadioButton rb1 = new RadioButton("C");
	    RadioButton rb2 = new RadioButton("Java");
	    RadioButton rb3 = new RadioButton("C++");
	    RadioButton rb4 = new RadioButton("C#");
	    rb1.setToggleGroup(group);
	    rb2.setToggleGroup(group);
	    rb3.setToggleGroup(group);
	    rb4.setToggleGroup(group);
        // 创建一个水平组件框，并把4个按钮添加到其上
		HBox hbox = new HBox();
	    hbox.setPadding(new Insets(10));
	    hbox.setSpacing(20);
        hbox.setAlignment(Pos.CENTER);
	    hbox.getChildren().addAll(rb1,rb2,rb3,rb4);
      // 为每个按钮设置一个用户数据对象，以方便之后检索出来 
	    rb1.setUserData("c");
	    rb2.setUserData("java");
	    rb3.setUserData("cplus");
	    rb4.setUserData("csharp");
      // 使用Lambda表达式创建一个事件处理器对象
	    EventHandler<ActionEvent> handler = e->{
	        if (group.getSelectedToggle() != null) {
               //final Image image = new Image("images\\" +  group.getSelectedToggle().getUserData().toString() +".png");
                String imageName = group.getSelectedToggle().getUserData().toString();
                String imagePath = "/images/" + imageName + ".png";
                Image image = new Image(getClass().getResourceAsStream(imagePath));
                ImageView imageView = new ImageView(image);
                label.setText("你选择的语言是");
                label.setGraphic(imageView);
                label.setContentDisplay(ContentDisplay.RIGHT);
            }
		};
      // 为按钮注册事件处理器
		rb1.setOnAction(handler);
		rb2.setOnAction(handler);
		rb3.setOnAction(handler);
		rb4.setOnAction(handler);
      // 创建根面板
	    BorderPane rootNode = new BorderPane();
	    rootNode.setCenter(label);
	    rootNode.setBottom(hbox);
	    Scene scene = new Scene(rootNode, 300, 120);		
	    stage.setScene(scene);
	    stage.setTitle("单选按钮示例");
	    stage.show();
	}
	public static void main(String[] args) {
		   launch(args);
	}
}
