package com.boda.xy;
import module javafx.controls;
public class ImageDemo2 extends Application {
    @Override
    public void start(Stage stage) {
        var rootPane = new FlowPane();

        var localImage = new Image(getClass().getResourceAsStream("/images/boat.jpg"));
        var imageView = new ImageView(localImage);

        rootPane.getChildren().addAll(imageView);
        var scene = new Scene(rootPane, localImage.getWidth(),
                                         localImage.getHeight());

        stage.setTitle("图像视图示例");
        stage.setWidth(localImage.getWidth());
        stage.setHeight(localImage.getHeight());
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();

    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}

