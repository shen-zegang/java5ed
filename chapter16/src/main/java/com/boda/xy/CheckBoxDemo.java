package com.boda.xy;
import module javafx.controls;

public class CheckBoxDemo extends Application{
	public void start(Stage stage){
		CheckBox bold = new CheckBox("粗体");
		CheckBox italic = new CheckBox("斜体");
		bold.setGraphic(new ImageView(new Image(getClass().getResourceAsStream("/images/bold.png"))));
        italic.setGraphic(new ImageView(new Image(getClass().getResourceAsStream("/images/italic.png"))));
		bold.setContentDisplay(ContentDisplay.LEFT);
		italic.setContentDisplay(ContentDisplay.LEFT);
		bold.setPadding(new Insets(5,5,5,5));
		italic.setPadding(new Insets(5,5,5,5));
		// 创建几种字体对象
		Font font1 = Font.font("Times New Roman",
FontWeight.BOLD, FontPosture.REGULAR,16);
		Font font2 = Font.font("Times New Roman",
FontWeight.NORMAL, FontPosture.ITALIC,16);
		Font font3 = Font.font("Times New Roman",
FontWeight.BOLD,FontPosture.ITALIC,16);
		Font font4 = Font.font("Times New Roman",
FontWeight.NORMAL,FontPosture.REGULAR,16);
		// 创建文本对象
		Text text = new Text("JavaFX Programming");
		text.setFill(Color.RED);
		// 创建面板对象，并添加文本和复选框
		Pane pane = new Pane();
		pane.getChildren().add(text);
		HBox hbox = new HBox();
		hbox.getChildren().addAll(bold,italic);
		// 创建根面板
		BorderPane rootNode = new BorderPane();		
		rootNode.setCenter(hbox);
		rootNode.setBottom(pane);
		// 创建事件处理器对象
		EventHandler<ActionEvent> handler = e->{
		   if(bold.isSelected() && italic.isSelected()){
			  text.setFont(font3); 
		   }else if(bold.isSelected()){
			   text.setFont(font1); 
		   }else if(italic.isSelected()){
			   text.setFont(font2);
		   }else{
			   text.setFont(font4);
		   }
		};
		bold.setOnAction(handler);
		italic.setOnAction(handler);		
	    Scene scene = new Scene(rootNode, 250, 80);		
		stage.setScene(scene);
		stage.setTitle("复选框示例");
		stage.show();
	}
	public static void main(String[] args) {
	   launch(args);
	}
}
