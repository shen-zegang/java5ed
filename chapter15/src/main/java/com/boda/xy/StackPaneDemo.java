package com.boda.xy;
import module javafx.controls;

public class StackPaneDemo extends Application {
    @Override
    public void start(Stage stage) {
    	StackPane rootNode = new StackPane();
    	Rectangle rectangle = new Rectangle(80,100,Color.GRAY);
    	rectangle.setStroke(Color.RED);
    	
    	Ellipse ellipse = new Ellipse(88, 45, 45, 30);
    	ellipse.setFill(Color.BLUE);
    	ellipse.setStroke(Color.LIGHTGREY);

    	Text text = new Text("3");
    	text.setFont(Font.font(null, 38));
    	text.setFill(Color.WHITE);

    	rootNode.getChildren().addAll(rectangle, ellipse, text);
    	Scene scene = new Scene(rootNode, 200, 100);
    	stage.setTitle("栈面板示例");
    	stage.setScene(scene);
    	stage.show();

    	}

     public static void main(String[] args) {
        launch(args);
    }
}
