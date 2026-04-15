package com.boda.xy;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Program06 extends Application {
	@Override
	public void start(Stage stage) {
		Pane rootNode = new Pane();
		Circle circle = new Circle(10);
		circle.setFill(Color.BLUE);

		Ellipse ellipse = new Ellipse(150, 75, 80, 40);
		ellipse.setFill(Color.CYAN);
		ellipse.setStroke(Color.BLACK);

		rootNode.getChildren().add(ellipse);
		rootNode.getChildren().add(circle);

		PathTransition pt = new PathTransition(Duration.millis(4500), ellipse, circle);
		pt.setCycleCount(Timeline.INDEFINITE);
		pt.play();
		Scene scene = new Scene(rootNode, 300, 150, Color.CYAN);
		stage.setTitle("移动动画");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
