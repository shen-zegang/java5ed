package com.boda.xy;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
public class Program08 extends Application{
	   @Override
	   public void start(Stage stage){
		  HBox rootNode = new HBox();
		  rootNode.setPadding(new Insets(5,5,5,5));	  
		  ImageView [] cards = new ImageView[4];
		  int[]deck = new int[52];
		  //初始化每一张牌
		  for(int i =0; i<deck.length;i++)
		       deck[i] = i;
		  //打乱牌的次序
		  for(int i =0; i<deck.length;i++){
		      //随机产生一个元素下标0~51
		      int index = (int)(Math.random()*deck.length);
		      int temp = deck[i]; //将当前元素与产生的元素交换
		      deck[i] = deck[index];
		      deck[index] = temp;
		  }
		  //显示输出前4张牌
		  for(int i = 0; i < 4; i++){
		     cards[i] = new ImageView("images\\card\\"+(deck[i]+1)+".png");
		     rootNode.getChildren().add(cards[i]); 
		  }
	      Scene scene = new Scene(rootNode);
	      stage.setTitle("随机显示四张牌");   
	      stage.setScene(scene);       
	      stage.show();                 
	   }
	   public static void main(String[]args){
		   launch(args);
	   }
}
