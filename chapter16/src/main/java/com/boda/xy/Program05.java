package com.boda.xy;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene; 
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage; 
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
public class Program05 extends Application {
    Label label = new Label();
    Button add = new Button("加法"),
           sub = new Button("减法"),
           mul = new Button("乘法"),
           div = new Button("除法");
    TextField num1 = new TextField(),
    		  num2 = new TextField(),
    		  result = new TextField();
              
    @Override
    public void start(Stage stage) {
       HBox hb1 = new HBox(),
            hb2 = new HBox();
       hb1.setSpacing(5);
       hb2.setSpacing(10);
       num1.setPrefColumnCount(3);
       num2.setPrefColumnCount(3);
       result.setPrefColumnCount(5);
       hb1.getChildren().addAll(new Label("数1"),num1,new Label("数2"),num2,new Label("="),result);
       hb2.getChildren().addAll(add,sub,mul,div);
       
    	ButtonHandler handler = new ButtonHandler();    // 创建内部类对象
        // 为“确定”按钮注册事件处理器
        add.setOnAction(handler);
        sub.setOnAction(handler);
        mul.setOnAction(handler);
        div.setOnAction(handler);
		  // 创建根节点和场景
		  FlowPane rootNode = new FlowPane(10,10);
		  rootNode.setAlignment(Pos.CENTER); 
		  rootNode.getChildren().addAll(hb1, hb2);
        Scene scene = new Scene(rootNode, 240, 100);
        stage.setTitle("计数器示例");
        stage.setScene(scene);
        stage.show();
   }
   // 内部类实现事件处理方法
   public class ButtonHandler implements EventHandler<ActionEvent>{
	   double n1 = 0;
	   double n2 = 0;
	   double r = 0;
       @Override
       public void handle(ActionEvent event) {
    	   n1=Double.parseDouble(num1.getText());
           n2=Double.parseDouble(num2.getText());
         if((Button)(event.getSource())==add){
           r = n1 + n2;
           result.setText(r+"");
         }else if(event.getSource()==sub){
        	 r = n1 - n2;
             result.setText(r+"");
        }else if(event.getSource()==mul){
       	 r = n1 * n2;
         result.setText(r+"");
        }else if(event.getSource()==div){
       	 r = n1 / n2;
         result.setText(r+"");
        }
      } 
    }  
   public static void main(String[] args) {
	      launch(args);
   }
}

