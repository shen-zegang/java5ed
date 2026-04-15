package com.boda.xy;
import module javafx.controls;

public class LabelDemo extends Application{
	 public void start(Stage stage){
		HBox hbox = new HBox();
	    hbox.setPadding(new Insets(10));
	    hbox.setSpacing(8);
        Label label1 = new Label("欢迎!");
        Image image = new Image(getClass().getResourceAsStream("/images/coffee.gif"));
	    label1.setTextFill(Color.web("#00763a"));
	    label1.setFont(new Font("黑体",24));
	    label1.setGraphic(new ImageView(image));
	    label1.setContentDisplay(ContentDisplay.RIGHT);
	    
	    Label label2 = new Label ("Values");
	    label2.setFont(new Font("Cambria", 32));
	    label2.setRotate(270);
	    label2.setTranslateY(50);

	    Label label3 = new Label("A label that needs to be wrapped");
	    label3.setWrapText(true);
	    label3.setOnMouseEntered((MouseEvent e) -> {
	        label3.setScaleX(1.5);
	        label3.setScaleY(1.5);
	    });
        // 当鼠标离开标签时，标签恢复原来大小  
	    label3.setOnMouseExited((MouseEvent e) -> {
	        label3.setScaleX(1);
	        label3.setScaleY(1);
	    });

	    // 将标签添加到根面板中
	    hbox.getChildren().addAll(label1,label2,label3);
	    Scene scene = new Scene(hbox, 480, 150);		
		stage.setScene(scene);
		stage.setTitle("标签示例");
		stage.show();
	 }
	 public static void main(String[] args) {
	      launch(args);
   }
}
