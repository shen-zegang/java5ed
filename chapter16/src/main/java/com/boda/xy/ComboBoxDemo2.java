package com.boda.xy;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.event.*;
 
public class ComboBoxDemo2 extends Application {
    final Button button = new Button ("�����ʼ�");
    final Label notification = new Label ();
    final TextField subject = new TextField("");
    final TextArea text = new TextArea ("");   
    String address = " "; 
    @Override 
    public void start(Stage stage) {
    	ComboBox<String> cbo = new ComboBox();
    	cbo.getItems().addAll("选项一","选项二", "选项三","选项四");
    	cbo.setStyle("-fx-color:red");
    	cbo.setValue("选项一");

        


        GridPane grid = new GridPane();
        grid.setVgap(4);
        grid.setHgap(10);
        grid.setPadding(new Insets(5, 5, 5, 5));
        grid.add(new Label("请选择: "), 0, 0);
        grid.add(cbo, 1, 0);
        
       
        Group rootNode = new Group();
        rootNode.getChildren().add(grid);
        Scene scene = new Scene(rootNode, 500, 270); 
        stage.setTitle("组合框示例");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
