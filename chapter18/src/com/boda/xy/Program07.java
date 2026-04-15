package com.boda.xy;

//import java.time.LocalTime;
//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.control.Label;
//import javafx.scene.layout.StackPane;
//import javafx.scene.paint.Color;
//import javafx.scene.text.Font;
//import javafx.stage.Stage;
//import javafx.concurrent.Task;
//
//public class Program07 extends Application {
//	Label label = new Label("");
//	@Override
//    public void start(Stage stage) {
//	    StackPane rootNode = new StackPane();
//        // 将标签添加到根节点上
//        rootNode.getChildren().add(label);
//        // 创建场景对象，指定根节点对象和大小
//        Scene scene = new Scene(rootNode, 200, 80);
//        // 将场景添加到舞台中
//        label.setTextFill(Color.web("#0076a3"));
//        label.setFont(new Font("Cambria", 32) );
//        stage.setTitle("当前时间");
//        stage.setScene(scene);
//        stage.show();
//
//       Task<Void> task = new Task<Void>() {
//    	   LocalTime lt = LocalTime.now();
//    	   @Override
//    	   public Void call() {
//              while (true) {
//           	     lt = LocalTime.now();
//           	     // Task接口中的方法
//           	     updateMessage(lt.toString().substring(0, 8));
//                 try {
//                    Thread.sleep(1000); // 线程睡眠1秒钟
//                 } catch (InterruptedException e){ }
//              }
//              //return null;
//         }
//        };
//
//        label.textProperty().bind(task.messageProperty());
//        new Thread(task).start();
//    }
//    public static void main(String[] args) {
//    	 // 启动JavaFX应用程序
//        launch(args);
//    }
//}


