package com.boda.xy;

//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.control.Slider;
//import javafx.scene.layout.*;
//import javafx.scene.text.*;
//import javafx.stage.Stage;
import module javafx.controls;
public class SliderDemo extends Application {
    @Override
    public void start(Stage stage) {
       Text text = new Text(20,20,"JavaFX Programming");
       Slider slider = new Slider();
       slider.setShowTickLabels(true);
       slider.setShowTickMarks(true);
       slider.setValue(text.getFont().getSize());
       
       StackPane pane = new StackPane();
       pane.getChildren().add(text);
       // 为value属性添加监听器
       slider.valueProperty().addListener(ov->{
    	   double size = slider.getValue();
    	   Font font = new Font(size);
    	   text.setFont(font);
       });
       
       
      
       BorderPane rootNode = new BorderPane();
       rootNode.setCenter(pane);
       rootNode.setBottom(slider);
       Scene scene = new Scene(rootNode, 350,110);
       stage.setScene(scene);
       stage.setTitle("滑动条示例");
       stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}

