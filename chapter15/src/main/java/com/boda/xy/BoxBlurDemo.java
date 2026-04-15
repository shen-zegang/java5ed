package com.boda.xy;
import module javafx.controls;

public class BoxBlurDemo extends Application {
	@Override
	  public void start(Stage stage) {
		BoxBlur boxBlur = new BoxBlur();
		boxBlur.setWidth(5);  
		boxBlur.setHeight(1);
		boxBlur.setIterations(2);
		// 为文本设置模糊特效
		Text text = new Text();
		text.setText("文本模糊效果!");
		text.setFill(Color.web("0x3b596d"));
		text.setFont(Font.font(null, FontWeight.BOLD, 30));
		text.setX(8);
		text.setY(50);
		text.setEffect(boxBlur);

		  
		Group rootNode = new Group();
		rootNode.getChildren().addAll(text);
		Scene scene = new Scene(rootNode,300,200);
		stage.setTitle("Effect");
		stage.setScene(scene);
		stage.show();                   // ��ʾ��̨����
    }
    public static void main(String[] args) {
        // ����JavaFXӦ�ó���
         Application.launch(args);
    }
}

