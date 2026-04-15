package com.boda.xy;
import module javafx.controls;

public class GlowEffectDemo extends Application {
	@Override
	  public void start(Stage stage) {
		Image image = new Image(getClass().getResourceAsStream("/images/boat.jpg"));
		ImageView imageView = new ImageView(image);
		imageView.setFitWidth(200);
		imageView.setPreserveRatio(true);
		imageView.setEffect(new Glow(0.8));

		ImageView imageView2 = new ImageView(image);
		imageView2.setFitWidth(200);
		imageView2.setPreserveRatio(true); 
		
		FlowPane rootNode = new FlowPane();
		  rootNode.setHgap(20);
		  rootNode.getChildren().addAll(imageView,imageView2);
		  Scene scene = new Scene(rootNode,500,200);
		  stage.setTitle("发光特效");
		  stage.setScene(scene);
		  stage.show();       
    }
    public static void main(String[] args) {
        
         Application.launch(args);
    }
}

