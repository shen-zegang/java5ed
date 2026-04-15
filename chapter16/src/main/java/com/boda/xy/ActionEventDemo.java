package com.boda.xy;
import module javafx.controls;

public class ActionEventDemo extends Application {
    Label label = new Label();
    Button ok = new Button("确定"),
           cancel = new Button("取消");
    @Override
    public void start(Stage stage) {

        ok.setOnAction(event -> label.setText("你单击了’确定’按钮"));
        cancel.setOnAction(event ->label.setText("你单击了’取消’按钮"));

	    FlowPane rootNode = new FlowPane(10,10);
		rootNode.setAlignment(Pos.CENTER); 
		rootNode.getChildren().addAll(ok, cancel, label);
        Scene scene = new Scene(rootNode, 240, 100);

        stage.setTitle("事件处理示例");
        stage.setScene(scene);
        stage.show();
   }



    public static void main(String[] args) {
	      launch(args);
   }
}
